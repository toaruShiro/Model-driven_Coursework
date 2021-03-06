/**
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.myDbl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.SingleCondition#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getSingleCondition()
 * @model
 * @generated
 */
public interface SingleCondition extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.shiro.mydbl0304.myDbl.SingleConditionUnit}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getSingleCondition_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<SingleConditionUnit> getConditions();

} // SingleCondition
