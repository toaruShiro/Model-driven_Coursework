/**
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.myDbl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.Database#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.shiro.mydbl0304.myDbl.Database#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getDatabase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.shiro.mydbl0304.myDbl.Database#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.shiro.mydbl0304.myDbl.Instructions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage#getDatabase_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instructions> getInstructions();

} // Database
