/**
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import uk.ac.kcl.shiro.mydbl0304.myDbl.AddInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Attribute;
import uk.ac.kcl.shiro.mydbl0304.myDbl.AttributeOfElement;
import uk.ac.kcl.shiro.mydbl0304.myDbl.CreateAttributeInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.CreateTableInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Database;
import uk.ac.kcl.shiro.mydbl0304.myDbl.FindInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Instructions;
import uk.ac.kcl.shiro.mydbl0304.myDbl.JointElement;
import uk.ac.kcl.shiro.mydbl0304.myDbl.MyDblPackage;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SingleCondition;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SingleConditionUnit;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SingleElement;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Target;
import uk.ac.kcl.shiro.mydbl0304.validation.AbstractMyDblValidator;

/**
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MyDblValidator extends AbstractMyDblValidator {
  public static final String UPPER_CASE_ATTRIBUTE_NAME = "upperCaseAttributeName";
  
  public static final String INVALID_ATTRIBUTE_NAME = "invalidAttributeName";
  
  public static final String UNDEFINED_ELEMENT_NAME = "undefinedElementName";
  
  @Check(CheckType.NORMAL)
  public void checkFormatedAttributeName(final Database db) {
    this.checkCorrectNaming(db.getInstructions());
  }
  
  public void checkCorrectNaming(final EList<Instructions> statements) {
    for (int i = 0; (i < statements.size()); i++) {
      Instructions _get = statements.get(i);
      if ((_get instanceof CreateAttributeInstruction)) {
        Instructions _get_1 = statements.get(i);
        CreateAttributeInstruction ins = ((CreateAttributeInstruction) _get_1);
        this.checkUpperCaseAttributeName(ins, statements);
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkAvailableAttributeName(final Database db) {
    this.checkCorrectSemantic(db.getInstructions());
  }
  
  public void checkCorrectSemantic(final EList<Instructions> statements) {
    for (int i = 0; (i < statements.size()); i++) {
      {
        Instructions _get = statements.get(i);
        if ((_get instanceof FindInstruction)) {
          Instructions _get_1 = statements.get(i);
          FindInstruction ins = ((FindInstruction) _get_1);
          this.checkAlwaysHaveCorrectAttribute(ins, statements);
        }
        Instructions _get_2 = statements.get(i);
        if ((_get_2 instanceof AddInstruction)) {
          Instructions _get_3 = statements.get(i);
          AddInstruction ins_1 = ((AddInstruction) _get_3);
          this.checkCorrectAttribute(ins_1, statements);
        }
      }
    }
  }
  
  public void checkUpperCaseAttributeName(final CreateAttributeInstruction createAttributeInstruction, final EList<Instructions> statements) {
    String attributeName = createAttributeInstruction.getAttribute().getName();
    for (int i = 0; (i < attributeName.length()); i++) {
      boolean _isUpperCase = Character.isUpperCase(attributeName.charAt(i));
      if (_isUpperCase) {
        this.warning("Name should not contain upper case, please use \"_\" instead", createAttributeInstruction.getAttribute(), 
          MyDblPackage.Literals.ATTRIBUTE__NAME, MyDblValidator.UPPER_CASE_ATTRIBUTE_NAME);
      }
    }
  }
  
  public void checkAlwaysHaveCorrectAttribute(final FindInstruction statement, final EList<Instructions> statements) {
    if ((statement instanceof SingleElement)) {
      SingleElement ins = ((SingleElement) statement);
      this.checkAlwaysHaveCorrectTarget(ins, statements);
    }
    if ((statement instanceof JointElement)) {
      JointElement ins_1 = ((JointElement) statement);
      this.checkAlwaysHaveCorrectTarget(ins_1, statements);
    }
  }
  
  public void checkAlwaysHaveCorrectTarget(final SingleElement statement, final EList<Instructions> statements) {
    if (((statement.getTargets() == null) && (statement.getConditions() == null))) {
      return;
    }
    List<Attribute> attributeList = new ArrayList<Attribute>();
    for (int i = 0; (i < statements.size()); i++) {
      Instructions _get = statements.get(i);
      if ((_get instanceof CreateAttributeInstruction)) {
        Instructions _get_1 = statements.get(i);
        CreateAttributeInstruction createAttributeInstruction = ((CreateAttributeInstruction) _get_1);
        String elementName = this.getElementName(createAttributeInstruction);
        boolean _equals = elementName.equals(statement.getElement().getName());
        if (_equals) {
          attributeList.add(createAttributeInstruction.getAttribute());
        }
      }
    }
    Target _targets = statement.getTargets();
    boolean _tripleNotEquals = (_targets != null);
    if (_tripleNotEquals) {
      for (int i = 0; (i < statement.getTargets().getAttributes().size()); i++) {
        this.judgeAttributeName(statement.getTargets().getAttributes().get(i), attributeList, statement.getElement().getName());
      }
    }
    SingleCondition _conditions = statement.getConditions();
    boolean _tripleNotEquals_1 = (_conditions != null);
    if (_tripleNotEquals_1) {
      for (int i = 0; (i < statement.getConditions().getConditions().size()); i++) {
        this.judgeSingleCondition(statement.getConditions().getConditions().get(i), attributeList, statement.getElement().getName());
      }
    }
  }
  
  public String getElementName(final CreateAttributeInstruction instruction) {
    return instruction.getElement().getName();
  }
  
  public String getAttributeName(final CreateAttributeInstruction instruction) {
    return instruction.getAttribute().getName();
  }
  
  public void judgeAttributeName(final Attribute attribute, final List<Attribute> attributeList, final String elementName) {
    for (int i = 0; (i < attributeList.size()); i++) {
      boolean _equals = attribute.getName().equals(attributeList.get(i).getName());
      if (_equals) {
        return;
      }
    }
    String _name = attribute.getName();
    String _plus = ((("The element \"" + elementName) + "\" does not have this attribute: \"") + _name);
    String _plus_1 = (_plus + "\"");
    this.error(_plus_1, attribute, 
      MyDblPackage.Literals.ATTRIBUTE__NAME, MyDblValidator.INVALID_ATTRIBUTE_NAME);
  }
  
  public void judgeSingleCondition(final SingleConditionUnit unit, final List<Attribute> attributeList, final String elementName) {
    this.judgeAttributeName(unit.getAttributeLeft(), attributeList, elementName);
    Attribute _attributeRight = unit.getAttributeRight();
    boolean _tripleNotEquals = (_attributeRight != null);
    if (_tripleNotEquals) {
      this.judgeAttributeName(unit.getAttributeRight(), attributeList, elementName);
    }
  }
  
  public void checkAlwaysHaveCorrectTarget(final JointElement statement, final EList<Instructions> statements) {
    List<List<Attribute>> elementList = new ArrayList<List<Attribute>>();
    for (int i = 0; (i < statement.getElements().size()); i++) {
      {
        List<Attribute> attributeList = new ArrayList<Attribute>();
        elementList.add(attributeList);
      }
    }
    for (int j = 0; (j < statements.size()); j++) {
      Instructions _get = statements.get(j);
      if ((_get instanceof CreateAttributeInstruction)) {
        Instructions _get_1 = statements.get(j);
        CreateAttributeInstruction createAttributeInstruction = ((CreateAttributeInstruction) _get_1);
        String elementName = this.getElementName(createAttributeInstruction);
        for (int k = 0; (k < elementList.size()); k++) {
          boolean _equals = elementName.equals(statement.getElements().get(k).getName());
          if (_equals) {
            elementList.get(k).add(createAttributeInstruction.getAttribute());
          }
        }
      }
    }
    for (int i = 0; (i < statement.getConditions().getConditions().size()); i++) {
      {
        String elementName = statement.getConditions().getConditions().get(i).getElementLeft().getElement().getName();
        Attribute attribute = statement.getConditions().getConditions().get(i).getElementLeft().getAttribute();
        for (int j = 0; (j < elementList.size()); j++) {
          boolean _equals = elementName.equals(statement.getElements().get(j).getName());
          if (_equals) {
            this.judgeAttributeName(attribute, elementList.get(j), statement.getElements().get(j).getName());
          }
        }
        AttributeOfElement _elementRight = statement.getConditions().getConditions().get(i).getElementRight();
        boolean _tripleNotEquals = (_elementRight != null);
        if (_tripleNotEquals) {
          elementName = statement.getConditions().getConditions().get(i).getElementRight().getElement().getName();
          attribute = statement.getConditions().getConditions().get(i).getElementRight().getAttribute();
          for (int j = 0; (j < elementList.size()); j++) {
            boolean _equals = elementName.equals(statement.getElements().get(j).getName());
            if (_equals) {
              this.judgeAttributeName(attribute, elementList.get(j), statement.getElements().get(j).getName());
            }
          }
        }
      }
    }
  }
  
  public void checkCorrectAttribute(final AddInstruction statement, final EList<Instructions> statements) {
    for (int i = 0; (i < statements.size()); i++) {
      Instructions _get = statements.get(i);
      if ((_get instanceof CreateTableInstruction)) {
        Instructions _get_1 = statements.get(i);
        CreateTableInstruction createTableInstruction = ((CreateTableInstruction) _get_1);
        String elementName = createTableInstruction.getElement().getElement().getName();
        boolean _equals = elementName.equals(statement.getElement().getName());
        if (_equals) {
          return;
        }
      }
    }
    String _name = statement.getElement().getName();
    String _plus = ("The element \"" + _name);
    String _plus_1 = (_plus + "\" is not defined");
    this.error(_plus_1, statement.getElement(), 
      MyDblPackage.Literals.ELEMENT__NAME, MyDblValidator.UNDEFINED_ELEMENT_NAME);
  }
}
