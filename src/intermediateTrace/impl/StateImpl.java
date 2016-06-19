/**
 */
package intermediateTrace.impl;

import intermediateTrace.IntermediateTracePackage;
import intermediateTrace.LocationInstance;
import intermediateTrace.State;
import intermediateTrace.TemplateInstance;
import intermediateTrace.Valuation;

import intermediateTrace.clocks.AbstractClockBoundary;

import intermediateTrace.transitions.AbstractTransition;
import intermediateTrace.transitions.TransitionsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link intermediateTrace.impl.StateImpl#getTransitionTo <em>Transition To</em>}</li>
 *   <li>{@link intermediateTrace.impl.StateImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link intermediateTrace.impl.StateImpl#getValuations <em>Valuations</em>}</li>
 *   <li>{@link intermediateTrace.impl.StateImpl#getClocks <em>Clocks</em>}</li>
 *   <li>{@link intermediateTrace.impl.StateImpl#getTransitionFrom <em>Transition From</em>}</li>
 *   <li>{@link intermediateTrace.impl.StateImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link intermediateTrace.impl.StateImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getTransitionTo() <em>Transition To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTo()
	 * @generated
	 * @ordered
	 */
	protected AbstractTransition transitionTo;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<LocationInstance> locations;

	/**
	 * The cached value of the '{@link #getValuations() <em>Valuations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuations()
	 * @generated
	 * @ordered
	 */
	protected EList<Valuation> valuations;

	/**
	 * The cached value of the '{@link #getClocks() <em>Clocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractClockBoundary> clocks;

	/**
	 * The cached value of the '{@link #getTransitionFrom() <em>Transition From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionFrom()
	 * @generated
	 * @ordered
	 */
	protected AbstractTransition transitionFrom;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateInstance> templates;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected float time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateTracePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransition getTransitionTo() {
		if (transitionTo != null && transitionTo.eIsProxy()) {
			InternalEObject oldTransitionTo = (InternalEObject)transitionTo;
			transitionTo = (AbstractTransition)eResolveProxy(oldTransitionTo);
			if (transitionTo != oldTransitionTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateTracePackage.STATE__TRANSITION_TO, oldTransitionTo, transitionTo));
			}
		}
		return transitionTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransition basicGetTransitionTo() {
		return transitionTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionTo(AbstractTransition newTransitionTo, NotificationChain msgs) {
		AbstractTransition oldTransitionTo = transitionTo;
		transitionTo = newTransitionTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateTracePackage.STATE__TRANSITION_TO, oldTransitionTo, newTransitionTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionTo(AbstractTransition newTransitionTo) {
		if (newTransitionTo != transitionTo) {
			NotificationChain msgs = null;
			if (transitionTo != null)
				msgs = ((InternalEObject)transitionTo).eInverseRemove(this, TransitionsPackage.ABSTRACT_TRANSITION__SOURCE, AbstractTransition.class, msgs);
			if (newTransitionTo != null)
				msgs = ((InternalEObject)newTransitionTo).eInverseAdd(this, TransitionsPackage.ABSTRACT_TRANSITION__SOURCE, AbstractTransition.class, msgs);
			msgs = basicSetTransitionTo(newTransitionTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateTracePackage.STATE__TRANSITION_TO, newTransitionTo, newTransitionTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocationInstance> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<LocationInstance>(LocationInstance.class, this, IntermediateTracePackage.STATE__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Valuation> getValuations() {
		if (valuations == null) {
			valuations = new EObjectContainmentEList<Valuation>(Valuation.class, this, IntermediateTracePackage.STATE__VALUATIONS);
		}
		return valuations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractClockBoundary> getClocks() {
		if (clocks == null) {
			clocks = new EObjectContainmentEList<AbstractClockBoundary>(AbstractClockBoundary.class, this, IntermediateTracePackage.STATE__CLOCKS);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransition getTransitionFrom() {
		if (transitionFrom != null && transitionFrom.eIsProxy()) {
			InternalEObject oldTransitionFrom = (InternalEObject)transitionFrom;
			transitionFrom = (AbstractTransition)eResolveProxy(oldTransitionFrom);
			if (transitionFrom != oldTransitionFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateTracePackage.STATE__TRANSITION_FROM, oldTransitionFrom, transitionFrom));
			}
		}
		return transitionFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransition basicGetTransitionFrom() {
		return transitionFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionFrom(AbstractTransition newTransitionFrom, NotificationChain msgs) {
		AbstractTransition oldTransitionFrom = transitionFrom;
		transitionFrom = newTransitionFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateTracePackage.STATE__TRANSITION_FROM, oldTransitionFrom, newTransitionFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransitionFrom(AbstractTransition newTransitionFrom) {
		if (newTransitionFrom != transitionFrom) {
			NotificationChain msgs = null;
			if (transitionFrom != null)
				msgs = ((InternalEObject)transitionFrom).eInverseRemove(this, TransitionsPackage.ABSTRACT_TRANSITION__TARGET, AbstractTransition.class, msgs);
			if (newTransitionFrom != null)
				msgs = ((InternalEObject)newTransitionFrom).eInverseAdd(this, TransitionsPackage.ABSTRACT_TRANSITION__TARGET, AbstractTransition.class, msgs);
			msgs = basicSetTransitionFrom(newTransitionFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateTracePackage.STATE__TRANSITION_FROM, newTransitionFrom, newTransitionFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateInstance> getTemplates() {
		if (templates == null) {
			templates = new EObjectResolvingEList<TemplateInstance>(TemplateInstance.class, this, IntermediateTracePackage.STATE__TEMPLATES);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(float newTime) {
		float oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateTracePackage.STATE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateTracePackage.STATE__TRANSITION_TO:
				if (transitionTo != null)
					msgs = ((InternalEObject)transitionTo).eInverseRemove(this, TransitionsPackage.ABSTRACT_TRANSITION__SOURCE, AbstractTransition.class, msgs);
				return basicSetTransitionTo((AbstractTransition)otherEnd, msgs);
			case IntermediateTracePackage.STATE__TRANSITION_FROM:
				if (transitionFrom != null)
					msgs = ((InternalEObject)transitionFrom).eInverseRemove(this, TransitionsPackage.ABSTRACT_TRANSITION__TARGET, AbstractTransition.class, msgs);
				return basicSetTransitionFrom((AbstractTransition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateTracePackage.STATE__TRANSITION_TO:
				return basicSetTransitionTo(null, msgs);
			case IntermediateTracePackage.STATE__VALUATIONS:
				return ((InternalEList<?>)getValuations()).basicRemove(otherEnd, msgs);
			case IntermediateTracePackage.STATE__CLOCKS:
				return ((InternalEList<?>)getClocks()).basicRemove(otherEnd, msgs);
			case IntermediateTracePackage.STATE__TRANSITION_FROM:
				return basicSetTransitionFrom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateTracePackage.STATE__TRANSITION_TO:
				if (resolve) return getTransitionTo();
				return basicGetTransitionTo();
			case IntermediateTracePackage.STATE__LOCATIONS:
				return getLocations();
			case IntermediateTracePackage.STATE__VALUATIONS:
				return getValuations();
			case IntermediateTracePackage.STATE__CLOCKS:
				return getClocks();
			case IntermediateTracePackage.STATE__TRANSITION_FROM:
				if (resolve) return getTransitionFrom();
				return basicGetTransitionFrom();
			case IntermediateTracePackage.STATE__TEMPLATES:
				return getTemplates();
			case IntermediateTracePackage.STATE__TIME:
				return getTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntermediateTracePackage.STATE__TRANSITION_TO:
				setTransitionTo((AbstractTransition)newValue);
				return;
			case IntermediateTracePackage.STATE__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends LocationInstance>)newValue);
				return;
			case IntermediateTracePackage.STATE__VALUATIONS:
				getValuations().clear();
				getValuations().addAll((Collection<? extends Valuation>)newValue);
				return;
			case IntermediateTracePackage.STATE__CLOCKS:
				getClocks().clear();
				getClocks().addAll((Collection<? extends AbstractClockBoundary>)newValue);
				return;
			case IntermediateTracePackage.STATE__TRANSITION_FROM:
				setTransitionFrom((AbstractTransition)newValue);
				return;
			case IntermediateTracePackage.STATE__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends TemplateInstance>)newValue);
				return;
			case IntermediateTracePackage.STATE__TIME:
				setTime((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntermediateTracePackage.STATE__TRANSITION_TO:
				setTransitionTo((AbstractTransition)null);
				return;
			case IntermediateTracePackage.STATE__LOCATIONS:
				getLocations().clear();
				return;
			case IntermediateTracePackage.STATE__VALUATIONS:
				getValuations().clear();
				return;
			case IntermediateTracePackage.STATE__CLOCKS:
				getClocks().clear();
				return;
			case IntermediateTracePackage.STATE__TRANSITION_FROM:
				setTransitionFrom((AbstractTransition)null);
				return;
			case IntermediateTracePackage.STATE__TEMPLATES:
				getTemplates().clear();
				return;
			case IntermediateTracePackage.STATE__TIME:
				setTime(TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntermediateTracePackage.STATE__TRANSITION_TO:
				return transitionTo != null;
			case IntermediateTracePackage.STATE__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case IntermediateTracePackage.STATE__VALUATIONS:
				return valuations != null && !valuations.isEmpty();
			case IntermediateTracePackage.STATE__CLOCKS:
				return clocks != null && !clocks.isEmpty();
			case IntermediateTracePackage.STATE__TRANSITION_FROM:
				return transitionFrom != null;
			case IntermediateTracePackage.STATE__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case IntermediateTracePackage.STATE__TIME:
				return time != TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //StateImpl
