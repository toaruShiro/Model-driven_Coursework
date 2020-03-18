/**
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.myDbl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.shiro.mydbl0304.myDbl.Attribute;
import uk.ac.kcl.shiro.mydbl0304.myDbl.BasicVar;
import uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SetAttributeInstruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Attribute Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.impl.SetAttributeInstructionImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.impl.SetAttributeInstructionImpl#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetAttributeInstructionImpl extends MinimalEObjectImpl.Container implements SetAttributeInstruction
{
  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected Attribute attribute;

  /**
   * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeValue()
   * @generated
   * @ordered
   */
  protected BasicVar attributeValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SetAttributeInstructionImpl()
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
    return MyDblPackage.Literals.SET_ATTRIBUTE_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs)
  {
    Attribute oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE, oldAttribute, newAttribute);
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
  public void setAttribute(Attribute newAttribute)
  {
    if (newAttribute != attribute)
    {
      NotificationChain msgs = null;
      if (attribute != null)
        msgs = ((InternalEObject)attribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE, null, msgs);
      if (newAttribute != null)
        msgs = ((InternalEObject)newAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE, null, msgs);
      msgs = basicSetAttribute(newAttribute, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE, newAttribute, newAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BasicVar getAttributeValue()
  {
    return attributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeValue(BasicVar newAttributeValue, NotificationChain msgs)
  {
    BasicVar oldAttributeValue = attributeValue;
    attributeValue = newAttributeValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE_VALUE, oldAttributeValue, newAttributeValue);
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
  public void setAttributeValue(BasicVar newAttributeValue)
  {
    if (newAttributeValue != attributeValue)
    {
      NotificationChain msgs = null;
      if (attributeValue != null)
        msgs = ((InternalEObject)attributeValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE_VALUE, null, msgs);
      if (newAttributeValue != null)
        msgs = ((InternalEObject)newAttributeValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE_VALUE, null, msgs);
      msgs = basicSetAttributeValue(newAttributeValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE_VALUE, newAttributeValue, newAttributeValue));
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
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE:
        return basicSetAttribute(null, msgs);
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE_VALUE:
        return basicSetAttributeValue(null, msgs);
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
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE:
        return getAttribute();
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE_VALUE:
        return getAttributeValue();
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
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE:
        setAttribute((Attribute)newValue);
        return;
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE_VALUE:
        setAttributeValue((BasicVar)newValue);
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
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE:
        setAttribute((Attribute)null);
        return;
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE_VALUE:
        setAttributeValue((BasicVar)null);
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
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE:
        return attribute != null;
      case MyDblPackage.SET_ATTRIBUTE_INSTRUCTION__ATTRIBUTE_VALUE:
        return attributeValue != null;
    }
    return super.eIsSet(featureID);
  }

} //SetAttributeInstructionImpl