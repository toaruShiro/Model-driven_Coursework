/**
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.myDbl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.shiro.mydbl0304.myDbl.InsertInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SetAttributeInstruction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.impl.InsertInstructionImpl#getSetAttributeInstructions <em>Set Attribute Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertInstructionImpl extends MinimalEObjectImpl.Container implements InsertInstruction
{
  /**
   * The cached value of the '{@link #getSetAttributeInstructions() <em>Set Attribute Instructions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetAttributeInstructions()
   * @generated
   * @ordered
   */
  protected EList<SetAttributeInstruction> setAttributeInstructions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsertInstructionImpl()
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
    return MyDblPackage.Literals.INSERT_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SetAttributeInstruction> getSetAttributeInstructions()
  {
    if (setAttributeInstructions == null)
    {
      setAttributeInstructions = new EObjectContainmentEList<SetAttributeInstruction>(SetAttributeInstruction.class, this, MyDblPackage.INSERT_INSTRUCTION__SET_ATTRIBUTE_INSTRUCTIONS);
    }
    return setAttributeInstructions;
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
      case MyDblPackage.INSERT_INSTRUCTION__SET_ATTRIBUTE_INSTRUCTIONS:
        return ((InternalEList<?>)getSetAttributeInstructions()).basicRemove(otherEnd, msgs);
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
      case MyDblPackage.INSERT_INSTRUCTION__SET_ATTRIBUTE_INSTRUCTIONS:
        return getSetAttributeInstructions();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDblPackage.INSERT_INSTRUCTION__SET_ATTRIBUTE_INSTRUCTIONS:
        getSetAttributeInstructions().clear();
        getSetAttributeInstructions().addAll((Collection<? extends SetAttributeInstruction>)newValue);
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
      case MyDblPackage.INSERT_INSTRUCTION__SET_ATTRIBUTE_INSTRUCTIONS:
        getSetAttributeInstructions().clear();
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
      case MyDblPackage.INSERT_INSTRUCTION__SET_ATTRIBUTE_INSTRUCTIONS:
        return setAttributeInstructions != null && !setAttributeInstructions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InsertInstructionImpl