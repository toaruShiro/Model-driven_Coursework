/**
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.myDbl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.shiro.mydbl0304.myDbl.Element;
import uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SingleCondition;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SingleElement;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Target;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.impl.SingleElementImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.impl.SingleElementImpl#getElement <em>Element</em>}</li>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.impl.SingleElementImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleElementImpl extends FindInstructionImpl implements SingleElement
{
  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected Target targets;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected Element element;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected SingleCondition conditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SingleElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDblPackage.Literals.SINGLE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Target getTargets()
  {
    return targets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargets(Target newTargets, NotificationChain msgs)
  {
    Target oldTargets = targets;
    targets = newTargets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDblPackage.SINGLE_ELEMENT__TARGETS, oldTargets, newTargets);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTargets(Target newTargets)
  {
    if (newTargets != targets)
    {
      NotificationChain msgs = null;
      if (targets != null)
        msgs = ((InternalEObject)targets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SINGLE_ELEMENT__TARGETS, null, msgs);
      if (newTargets != null)
        msgs = ((InternalEObject)newTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SINGLE_ELEMENT__TARGETS, null, msgs);
      msgs = basicSetTargets(newTargets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDblPackage.SINGLE_ELEMENT__TARGETS, newTargets, newTargets));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(Element newElement, NotificationChain msgs)
  {
    Element oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDblPackage.SINGLE_ELEMENT__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setElement(Element newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SINGLE_ELEMENT__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SINGLE_ELEMENT__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDblPackage.SINGLE_ELEMENT__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SingleCondition getConditions()
  {
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditions(SingleCondition newConditions, NotificationChain msgs)
  {
    SingleCondition oldConditions = conditions;
    conditions = newConditions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDblPackage.SINGLE_ELEMENT__CONDITIONS, oldConditions, newConditions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConditions(SingleCondition newConditions)
  {
    if (newConditions != conditions)
    {
      NotificationChain msgs = null;
      if (conditions != null)
        msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SINGLE_ELEMENT__CONDITIONS, null, msgs);
      if (newConditions != null)
        msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SINGLE_ELEMENT__CONDITIONS, null, msgs);
      msgs = basicSetConditions(newConditions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDblPackage.SINGLE_ELEMENT__CONDITIONS, newConditions, newConditions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDblPackage.SINGLE_ELEMENT__TARGETS:
        return basicSetTargets(null, msgs);
      case MyDblPackage.SINGLE_ELEMENT__ELEMENT:
        return basicSetElement(null, msgs);
      case MyDblPackage.SINGLE_ELEMENT__CONDITIONS:
        return basicSetConditions(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDblPackage.SINGLE_ELEMENT__TARGETS:
        return getTargets();
      case MyDblPackage.SINGLE_ELEMENT__ELEMENT:
        return getElement();
      case MyDblPackage.SINGLE_ELEMENT__CONDITIONS:
        return getConditions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDblPackage.SINGLE_ELEMENT__TARGETS:
        setTargets((Target)newValue);
        return;
      case MyDblPackage.SINGLE_ELEMENT__ELEMENT:
        setElement((Element)newValue);
        return;
      case MyDblPackage.SINGLE_ELEMENT__CONDITIONS:
        setConditions((SingleCondition)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDblPackage.SINGLE_ELEMENT__TARGETS:
        setTargets((Target)null);
        return;
      case MyDblPackage.SINGLE_ELEMENT__ELEMENT:
        setElement((Element)null);
        return;
      case MyDblPackage.SINGLE_ELEMENT__CONDITIONS:
        setConditions((SingleCondition)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDblPackage.SINGLE_ELEMENT__TARGETS:
        return targets != null;
      case MyDblPackage.SINGLE_ELEMENT__ELEMENT:
        return element != null;
      case MyDblPackage.SINGLE_ELEMENT__CONDITIONS:
        return conditions != null;
    }
    return super.eIsSet(featureID);
  }

} //SingleElementImpl
