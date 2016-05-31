package parser;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;

import myTrace.LocationInstance;
import myTrace.MyTraceFactory;
import myTrace.MyTracePackage;
import myTrace.State;
import myTrace.TemplateInstance;
import myTrace.Transitions.DelayTransition;
import myTrace.Transitions.EdgeTransition;
import myTrace.Transitions.TransitionsFactory;
import myTrace.Transitions.TransitionsPackage;
import myTrace.Transitions.impl.TransitionsPackageImpl;
import myTrace.impl.MyTracePackageImpl;
import uppaal.templates.AbstractTemplate;
import uppaal.templates.Edge;
import uppaal.templates.Location;
import uppaal.templates.RedefinedTemplate;
import uppaal.templates.Template;
import uppaal.templates.TemplatesPackage;
import uppaal.templates.impl.TemplatesFactoryImpl;
import myTrace.Transitions.*;
import myTrace.Transitions.impl.*;

public class MetaFactory {

	private TransitionsFactory transitionsFactory;
	private MyTraceFactory factory;


	public MetaFactory() {
		factory = (MyTraceFactory) MyTracePackageImpl.eINSTANCE.getEFactoryInstance();
		transitionsFactory = (TransitionsFactory) TransitionsPackageImpl.eINSTANCE.getEFactoryInstance();
	}
	
	protected LocationInstance createLocationInstance(Location location) {
		LocationInstance res = factory.createLocationInstance();
		res.setLocation(location);
		return res;
	}
	
	public TemplateInstance createTemplateInstance(AbstractTemplate template) {
		// create templateInstance
		TemplateInstance res = factory.createTemplateInstance();
		Template locProvider = null;
		// list of locations -> list of locationInstances
		if (template instanceof Template) {
			locProvider = (Template)template;
		} else if(template instanceof RedefinedTemplate) {
			AbstractTemplate temp = template;
			while (temp instanceof RedefinedTemplate) {
				((RedefinedTemplate) temp).getReferredTemplate();
			}
			if (false == (temp instanceof Template)) {
				throw new RuntimeException("MetaFactory.java implementation is incomplete, please add handling of class " +temp.getClass());
			}
			locProvider = (Template)temp;
		} else {
			throw new RuntimeException("MetaFactory.java implementation is incomplete, please add handling of class " +locProvider.getClass());
		}
		
		EList<Location> locations = locProvider.getLocation();
		LocationInstance[] locationInstances = new LocationInstance[locations.size()];
		for (int i = 0; i < locations.size(); i++) {
			locationInstances[i] = this.createLocationInstance(locations.get(i));
		}
		// create EList
		UnmodifiableEList<LocationInstance> eList = new EcoreEList.UnmodifiableEList<LocationInstance>(
				(InternalEObject) res, 
				sFeature.LOCATION_INSTANCE, 
				locationInstances.length, 
				locationInstances
			);
		// add list to templateInstance
		res.setTemplate(template);
		res.eSet(sFeature.TEMPLATE_INSTANCE__LOCATIONS, eList);
		return res;
	}

	// as the owner of an EList should be set to the newly created element, any provided EList cannot be reused
	public State createState(EList<TemplateInstance> templates, EList<LocationInstance> locations, float time) {
		return createState(fromEListToArray(templates), fromEListToArray(locations), time);
	}

	// as the owner of an EList should be set to the newly created element, any provided EList cannot be reused
	public State createState(EList<TemplateInstance> templates, LocationInstance[] locations, float time) {
		return createState(fromEListToArray(templates), locations, time);
	}

	// as the owner of an EList should be set to the newly created element, any provided EList cannot be reused
	public State createState(TemplateInstance[] templates, EList<LocationInstance> locations, float time) {
		return createState(templates, fromEListToArray(locations), time);
	}
	
	// main createState-method
	public State createState(TemplateInstance[] templates, LocationInstance[] locations, float time) {
		// create state and add time
		State res = factory.createState();
		res.setTime(time);
		// create EList of templates and locations
		UnmodifiableEList<LocationInstance> eListLoc = new EcoreEList.UnmodifiableEList<LocationInstance>(
				(InternalEObject) res, 
				sFeature.LOCATION_INSTANCE, 
				locations.length, 
				locations
			);

		UnmodifiableEList<TemplateInstance> eListTem = new EcoreEList.UnmodifiableEList<TemplateInstance>(
				(InternalEObject) res, 
				sFeature.TEMPLATE_INSTANCE, 
				templates.length, 
				templates
			);
		// set EList as state property
		res.eSet(sFeature.STATE__TEMPLATES, eListTem);
		res.eSet(sFeature.STATE__LOCATIONS, eListLoc);
		
		return res;
	}
	
	public DelayTransition createDelayTransition(State source, State target, float delay) {
		DelayTransition res = transitionsFactory.createDelayTransition();
		res.setSource(source);
		res.setTarget(target);
		res.setDelay(delay);
		return res;
	}
	
	public EdgeTransition createEdgeTransition(State source, State target, Edge[] edges) {
		EdgeTransition res = transitionsFactory.createEdgeTransition();
		res.setSource(source);
		res.setTarget(target);
		// create list of 'uppaal' edges
		UnmodifiableEList<Edge> eList = new EcoreEList.UnmodifiableEList<Edge>(
				(InternalEObject) res, 
				TemplatesFactoryImpl.eINSTANCE.eClass().getEStructuralFeature(TemplatesPackage.EDGE), 
				edges.length, 
				edges
			);
		res.eSet(sFeatureTransitions.EDGE_TRANSITION__EDGES, eList);
		return res;
	}
	
	protected <T> T[] fromEListToArray(EList<T> eList) {
		@SuppressWarnings("unchecked")
		T[] res = (T[])new Object[eList.size()];
		for (int i = 0; i < eList.size(); i++)
			res[i] = eList.get(i);
		
		return res;
	}

	/** Short-hand used to avoid unnecessary long statements in the parent class */
	private static class sFeature {
		protected static EStructuralFeature STATE__TEMPLATES = getEStructuralFeature(MyTracePackage.STATE__TEMPLATES);
		protected static EStructuralFeature STATE__LOCATIONS = getEStructuralFeature(MyTracePackage.STATE__LOCATIONS);
		protected static EStructuralFeature TEMPLATE_INSTANCE = getEStructuralFeature(MyTracePackage.TEMPLATE_INSTANCE);
		protected static EStructuralFeature TEMPLATE_INSTANCE__LOCATIONS = getEStructuralFeature(MyTracePackage.TEMPLATE_INSTANCE__LOCATIONS);
		protected static EStructuralFeature LOCATION_INSTANCE = getEStructuralFeature(MyTracePackage.LOCATION_INSTANCE);
		

		private static EStructuralFeature getEStructuralFeature(int featureID) {
			return MyTraceFactory.eINSTANCE.eClass().getEStructuralFeature(featureID);
		}
	}
	/** Short-hand used to avoid unnecessary long statements in the parent class */
	private static class sFeatureTransitions {
		
		protected static EStructuralFeature EDGE_TRANSITION__EDGES = getEStructuralFeature(TransitionsPackage.EDGE_TRANSITION__EDGES);

		private static EStructuralFeature getEStructuralFeature(int featureID) {
			return TransitionsFactory.eINSTANCE.eClass().getEStructuralFeature(featureID);
		}
	}
}
