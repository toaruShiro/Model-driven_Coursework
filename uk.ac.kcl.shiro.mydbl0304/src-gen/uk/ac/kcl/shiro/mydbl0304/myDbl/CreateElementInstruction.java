/**
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.myDbl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Element Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.CreateElementInstruction#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getCreateElementInstruction()
 * @model
 * @generated
 */
public interface CreateElementInstruction extends Instructions
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Element)
   * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getCreateElementInstruction_Element()
   * @model containment="true"
   * @generated
   */
  Element getElement();

  /**
   * Sets the value of the '{@link uk.ac.kcl.shiro.mydbl0304.myDbl.CreateElementInstruction#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Element value);

} // CreateElementInstruction