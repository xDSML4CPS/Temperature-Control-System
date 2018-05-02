/**
 */
package cpsml.impl;

import cpsml.CpsmlPackage;
import cpsml.ODE;
import cpsml.State;
import cpsml.Transition;
import cpsml.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cpsml.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link cpsml.impl.SystemImpl#getOwnedvariables <em>Ownedvariables</em>}</li>
 *   <li>{@link cpsml.impl.SystemImpl#getRelatedvariable <em>Relatedvariable</em>}</li>
 *   <li>{@link cpsml.impl.SystemImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link cpsml.impl.SystemImpl#getOwnedTransitions <em>Owned Transitions</em>}</li>
 *   <li>{@link cpsml.impl.SystemImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link cpsml.impl.SystemImpl#getOwnedodes <em>Ownedodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements cpsml.System {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedvariables() <em>Ownedvariables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedvariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> ownedvariables;

	/**
	 * The cached value of the '{@link #getRelatedvariable() <em>Relatedvariable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedvariable()
	 * @generated
	 * @ordered
	 */
	protected Variable relatedvariable;

	/**
	 * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedStates;

	/**
	 * The cached value of the '{@link #getOwnedTransitions() <em>Owned Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> ownedTransitions;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * The cached value of the '{@link #getOwnedodes() <em>Ownedodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ODE> ownedodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsmlPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOwnedvariables() {
		if (ownedvariables == null) {
			ownedvariables = new EObjectContainmentEList<Variable>(Variable.class, this, CpsmlPackage.SYSTEM__OWNEDVARIABLES);
		}
		return ownedvariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getRelatedvariable() {
		if (relatedvariable != null && relatedvariable.eIsProxy()) {
			InternalEObject oldRelatedvariable = (InternalEObject)relatedvariable;
			relatedvariable = (Variable)eResolveProxy(oldRelatedvariable);
			if (relatedvariable != oldRelatedvariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsmlPackage.SYSTEM__RELATEDVARIABLE, oldRelatedvariable, relatedvariable));
			}
		}
		return relatedvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetRelatedvariable() {
		return relatedvariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedvariable(Variable newRelatedvariable) {
		Variable oldRelatedvariable = relatedvariable;
		relatedvariable = newRelatedvariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.SYSTEM__RELATEDVARIABLE, oldRelatedvariable, relatedvariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedStates() {
		if (ownedStates == null) {
			ownedStates = new EObjectContainmentEList<State>(State.class, this, CpsmlPackage.SYSTEM__OWNED_STATES);
		}
		return ownedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOwnedTransitions() {
		if (ownedTransitions == null) {
			ownedTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, CpsmlPackage.SYSTEM__OWNED_TRANSITIONS);
		}
		return ownedTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CpsmlPackage.SYSTEM__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpsmlPackage.SYSTEM__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODE> getOwnedodes() {
		if (ownedodes == null) {
			ownedodes = new EObjectContainmentEList<ODE>(ODE.class, this, CpsmlPackage.SYSTEM__OWNEDODES);
		}
		return ownedodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CpsmlPackage.SYSTEM__OWNEDVARIABLES:
				return ((InternalEList<?>)getOwnedvariables()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.SYSTEM__OWNED_STATES:
				return ((InternalEList<?>)getOwnedStates()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
				return ((InternalEList<?>)getOwnedTransitions()).basicRemove(otherEnd, msgs);
			case CpsmlPackage.SYSTEM__OWNEDODES:
				return ((InternalEList<?>)getOwnedodes()).basicRemove(otherEnd, msgs);
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
			case CpsmlPackage.SYSTEM__NAME:
				return getName();
			case CpsmlPackage.SYSTEM__OWNEDVARIABLES:
				return getOwnedvariables();
			case CpsmlPackage.SYSTEM__RELATEDVARIABLE:
				if (resolve) return getRelatedvariable();
				return basicGetRelatedvariable();
			case CpsmlPackage.SYSTEM__OWNED_STATES:
				return getOwnedStates();
			case CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
				return getOwnedTransitions();
			case CpsmlPackage.SYSTEM__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case CpsmlPackage.SYSTEM__OWNEDODES:
				return getOwnedodes();
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
			case CpsmlPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case CpsmlPackage.SYSTEM__OWNEDVARIABLES:
				getOwnedvariables().clear();
				getOwnedvariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case CpsmlPackage.SYSTEM__RELATEDVARIABLE:
				setRelatedvariable((Variable)newValue);
				return;
			case CpsmlPackage.SYSTEM__OWNED_STATES:
				getOwnedStates().clear();
				getOwnedStates().addAll((Collection<? extends State>)newValue);
				return;
			case CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				getOwnedTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case CpsmlPackage.SYSTEM__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
			case CpsmlPackage.SYSTEM__OWNEDODES:
				getOwnedodes().clear();
				getOwnedodes().addAll((Collection<? extends ODE>)newValue);
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
			case CpsmlPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CpsmlPackage.SYSTEM__OWNEDVARIABLES:
				getOwnedvariables().clear();
				return;
			case CpsmlPackage.SYSTEM__RELATEDVARIABLE:
				setRelatedvariable((Variable)null);
				return;
			case CpsmlPackage.SYSTEM__OWNED_STATES:
				getOwnedStates().clear();
				return;
			case CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
				getOwnedTransitions().clear();
				return;
			case CpsmlPackage.SYSTEM__INITIAL_STATE:
				setInitialState((State)null);
				return;
			case CpsmlPackage.SYSTEM__OWNEDODES:
				getOwnedodes().clear();
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
			case CpsmlPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CpsmlPackage.SYSTEM__OWNEDVARIABLES:
				return ownedvariables != null && !ownedvariables.isEmpty();
			case CpsmlPackage.SYSTEM__RELATEDVARIABLE:
				return relatedvariable != null;
			case CpsmlPackage.SYSTEM__OWNED_STATES:
				return ownedStates != null && !ownedStates.isEmpty();
			case CpsmlPackage.SYSTEM__OWNED_TRANSITIONS:
				return ownedTransitions != null && !ownedTransitions.isEmpty();
			case CpsmlPackage.SYSTEM__INITIAL_STATE:
				return initialState != null;
			case CpsmlPackage.SYSTEM__OWNEDODES:
				return ownedodes != null && !ownedodes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
