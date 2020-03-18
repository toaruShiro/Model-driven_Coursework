/**
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.myDbl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.DeleteInstruction#getElement <em>Element</em>}</li>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.DeleteInstruction#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getDeleteInstruction()
 * @model
 * @generated
 */
public interface DeleteInstruction extends Instructions
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Element)
   * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getDeleteInstruction_Element()
   * @model containment="true"
   * @generated
   */
  Element getElement();

  /**
   * Sets the value of the '{@link uk.ac.kcl.shiro.mydbl0304.myDbl.DeleteInstruction#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Element value);

  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference.
   * @see #setConditions(SingleCondition)
   * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getDeleteInstruction_Conditions()
   * @model containment="true"
   * @generated
   */
  SingleCondition getConditions();

  /**
   * Sets the value of the '{@link uk.ac.kcl.shiro.mydbl0304.myDbl.DeleteInstruction#getConditions <em>Conditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditions</em>' containment reference.
   * @see #getConditions()
   * @generated
   */
  void setConditions(SingleCondition value);

} // DeleteInstruction