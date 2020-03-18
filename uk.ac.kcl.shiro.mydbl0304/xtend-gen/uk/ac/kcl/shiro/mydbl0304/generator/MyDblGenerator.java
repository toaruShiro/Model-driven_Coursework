/**
 * generated by Xtext 2.21.0
 */
package uk.ac.kcl.shiro.mydbl0304.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import uk.ac.kcl.shiro.mydbl0304.myDbl.AddInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Attribute;
import uk.ac.kcl.shiro.mydbl0304.myDbl.AttributeOfElement;
import uk.ac.kcl.shiro.mydbl0304.myDbl.BasicVar;
import uk.ac.kcl.shiro.mydbl0304.myDbl.CreateAttributeInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.CreateTableInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Database;
import uk.ac.kcl.shiro.mydbl0304.myDbl.DeleteInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Element;
import uk.ac.kcl.shiro.mydbl0304.myDbl.FindInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.InsertInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Instructions;
import uk.ac.kcl.shiro.mydbl0304.myDbl.JointCondition;
import uk.ac.kcl.shiro.mydbl0304.myDbl.JointConditionUnit;
import uk.ac.kcl.shiro.mydbl0304.myDbl.JointElement;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SetAttributeInstruction;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SingleCondition;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SingleConditionUnit;
import uk.ac.kcl.shiro.mydbl0304.myDbl.SingleElement;
import uk.ac.kcl.shiro.mydbl0304.myDbl.Target;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDblGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Database> _filter = Iterables.<Database>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Database.class);
    for (final Database e : _filter) {
      QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e);
      String _plus = (_fullyQualifiedName + ".dbl");
      fsa.generateFile(_plus, 
        this.compile(e));
    }
  }
  
  protected String _generateAttribute(final Instructions stmt, final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("generateAttribute: ");
    return _builder.toString();
  }
  
  protected String _generateAttribute(final CreateAttributeInstruction stmt, final String name) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = stmt.getElement().getName().equals(name);
      if (_equals) {
        String _name = stmt.getAttribute().getName();
        _builder.append(_name);
        _builder.append(" ");
        String _attributeType = stmt.getAttributeType();
        _builder.append(_attributeType);
      }
    }
    return _builder.toString();
  }
  
  public String getRelatedAttribute(final Database d, final String name) {
    StringConcatenation _builder = new StringConcatenation();
    final ArrayList<Instructions> list = new ArrayList<Instructions>();
    _builder.newLineIfNotEmpty();
    {
      EList<Instructions> _instructions = d.getInstructions();
      for(final Instructions f : _instructions) {
        {
          if ((f instanceof CreateAttributeInstruction)) {
            {
              boolean _equals = ((CreateAttributeInstruction)f).getElement().getName().equals(name);
              if (_equals) {
                {
                  boolean _add = list.add(f);
                  if (_add) {
                  }
                }
              }
            }
          }
        }
      }
    }
    {
      int _size = list.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _generateAttribute = this.generateAttribute(list.get(0), name);
        _builder.append(_generateAttribute);
        {
          int _size_1 = list.size();
          boolean _greaterThan_1 = (_size_1 > 1);
          if (_greaterThan_1) {
            {
              int _size_2 = list.size();
              int _minus = (_size_2 - 1);
              IntegerRange _upTo = new IntegerRange(1, _minus);
              for(final Integer idx : _upTo) {
                _builder.append(",");
                _builder.newLineIfNotEmpty();
                String _generateAttribute_1 = this.generateAttribute(list.get((idx).intValue()), name);
                _builder.append(_generateAttribute_1);
              }
            }
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String _generateTable(final Instructions stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateTable(final CreateTableInstruction stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    String _name = stmt.getTable().getName();
    _builder.append(_name);
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _relatedAttribute = this.getRelatedAttribute(d, stmt.getElement().getElement().getName());
    _builder.append(_relatedAttribute, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append(");");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final Instructions stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final AddInstruction stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("INSERT INTO ");
    String _tableNameByElement = this.getTableNameByElement(stmt.getElement().getName(), d);
    _builder.append(_tableNameByElement);
    _builder.append(" (");
    String _insertAttributes = this.getInsertAttributes(stmt.getInsertInstruction());
    _builder.append(_insertAttributes);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("VALUES (");
    String _insertValues = this.getInsertValues(stmt.getInsertInstruction(), d, stmt.getElement().getName());
    _builder.append(_insertValues);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _getTableNameByElement(final String elementName, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Instructions> _instructions = d.getInstructions();
      for(final Instructions f : _instructions) {
        {
          if ((f instanceof CreateTableInstruction)) {
            {
              boolean _equals = ((CreateTableInstruction)f).getElement().getElement().getName().equals(elementName);
              if (_equals) {
                String _name = ((CreateTableInstruction)f).getTable().getName();
                _builder.append(_name);
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _getInsertAttributes(final InsertInstruction stmt) {
    StringConcatenation _builder = new StringConcatenation();
    final ArrayList<SetAttributeInstruction> list = new ArrayList<SetAttributeInstruction>();
    {
      EList<SetAttributeInstruction> _setAttributeInstructions = stmt.getSetAttributeInstructions();
      for(final SetAttributeInstruction f : _setAttributeInstructions) {
        {
          boolean _add = list.add(f);
          if (_add) {
          }
        }
      }
    }
    {
      int _size = list.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _name = list.get(0).getAttribute().getName();
        _builder.append(_name);
        {
          int _size_1 = list.size();
          boolean _greaterThan_1 = (_size_1 > 1);
          if (_greaterThan_1) {
            {
              int _size_2 = list.size();
              int _minus = (_size_2 - 1);
              IntegerRange _upTo = new IntegerRange(1, _minus);
              for(final Integer idx : _upTo) {
                _builder.append(", ");
                String _name_1 = list.get((idx).intValue()).getAttribute().getName();
                _builder.append(_name_1);
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _getInsertValues(final InsertInstruction stmt, final Database d, final String elementName) {
    StringConcatenation _builder = new StringConcatenation();
    final ArrayList<SetAttributeInstruction> list = new ArrayList<SetAttributeInstruction>();
    {
      EList<SetAttributeInstruction> _setAttributeInstructions = stmt.getSetAttributeInstructions();
      for(final SetAttributeInstruction f : _setAttributeInstructions) {
        {
          boolean _add = list.add(f);
          if (_add) {
          }
        }
      }
    }
    {
      int _size = list.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _generateBasicValue = this.generateBasicValue(list.get(0), d, elementName);
        _builder.append(_generateBasicValue);
        {
          int _size_1 = list.size();
          boolean _greaterThan_1 = (_size_1 > 1);
          if (_greaterThan_1) {
            {
              int _size_2 = list.size();
              int _minus = (_size_2 - 1);
              IntegerRange _upTo = new IntegerRange(1, _minus);
              for(final Integer idx : _upTo) {
                _builder.append(", ");
                String _generateBasicValue_1 = this.generateBasicValue(list.get((idx).intValue()), d, elementName);
                _builder.append(_generateBasicValue_1);
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String generateBasicValue(final SetAttributeInstruction stmt, final Database d, final String elementName) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Instructions> _instructions = d.getInstructions();
      for(final Instructions f : _instructions) {
        {
          if ((f instanceof CreateAttributeInstruction)) {
            {
              boolean _equals = ((CreateAttributeInstruction)f).getElement().getName().equals(elementName);
              if (_equals) {
                {
                  boolean _equals_1 = ((CreateAttributeInstruction)f).getAttribute().getName().equals(stmt.getAttribute().getName());
                  if (_equals_1) {
                    {
                      boolean _equals_2 = ((CreateAttributeInstruction)f).getAttributeType().equals("Integer");
                      if (_equals_2) {
                        int _integer = stmt.getAttributeValue().getInteger();
                        _builder.append(_integer);
                      }
                    }
                    {
                      boolean _equals_3 = ((CreateAttributeInstruction)f).getAttributeType().equals("Integer");
                      boolean _not = (!_equals_3);
                      if (_not) {
                        _builder.append("\'");
                        String _string = stmt.getAttributeValue().getString();
                        _builder.append(_string);
                        _builder.append("\'");
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final FindInstruction stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SELECT ");
    String _generateSelectTarget = this.generateSelectTarget(stmt, d);
    _builder.append(_generateSelectTarget);
    _builder.append(" FROM ");
    String _generateTableNameByElement = this.generateTableNameByElement(stmt, d);
    _builder.append(_generateTableNameByElement);
    String _generateSelectCondition = this.generateSelectCondition(stmt, d);
    _builder.append(_generateSelectCondition);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generateSelectTarget(final FindInstruction stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateSelectTarget(final SingleElement stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Target _targets = stmt.getTargets();
      boolean _tripleNotEquals = (_targets != null);
      if (_tripleNotEquals) {
        String _generateSelectTargets = this.generateSelectTargets(stmt.getTargets());
        _builder.append(_generateSelectTargets);
      }
    }
    {
      Target _targets_1 = stmt.getTargets();
      boolean _tripleEquals = (_targets_1 == null);
      if (_tripleEquals) {
        _builder.append("*");
      }
    }
    return _builder.toString();
  }
  
  protected String _generateSelectTargets(final Target stmt) {
    StringConcatenation _builder = new StringConcatenation();
    final ArrayList<Attribute> list = new ArrayList<Attribute>();
    {
      EList<Attribute> _attributes = stmt.getAttributes();
      for(final Attribute f : _attributes) {
        {
          boolean _add = list.add(f);
          if (_add) {
          }
        }
      }
    }
    String _name = list.get(0).getName();
    _builder.append(_name);
    {
      int _size = list.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        {
          int _size_1 = list.size();
          int _minus = (_size_1 - 1);
          IntegerRange _upTo = new IntegerRange(1, _minus);
          for(final Integer idx : _upTo) {
            _builder.append(", ");
            String _name_1 = list.get((idx).intValue()).getName();
            _builder.append(_name_1);
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _generateSelectTarget(final JointElement stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("*");
    return _builder.toString();
  }
  
  protected String _generateTableNameByElement(final FindInstruction stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateTableNameByElement(final SingleElement stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    String _tableNameByElement = this.getTableNameByElement(stmt.getElement().getName(), d);
    _builder.append(_tableNameByElement);
    return _builder.toString();
  }
  
  protected String _generateTableNameByElement(final JointElement stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    final ArrayList<Element> list = new ArrayList<Element>();
    {
      EList<Element> _elements = stmt.getElements();
      for(final Element f : _elements) {
        {
          boolean _add = list.add(f);
          if (_add) {
          }
        }
      }
    }
    String _tableNameByElement = this.getTableNameByElement(list.get(0).getName(), d);
    _builder.append(_tableNameByElement);
    _builder.append(" ");
    String _name = list.get(0).getName();
    _builder.append(_name);
    _builder.append(", ");
    String _tableNameByElement_1 = this.getTableNameByElement(list.get(1).getName(), d);
    _builder.append(_tableNameByElement_1);
    _builder.append(" ");
    String _name_1 = list.get(1).getName();
    _builder.append(_name_1);
    {
      int _size = list.size();
      boolean _greaterThan = (_size > 2);
      if (_greaterThan) {
        {
          int _size_1 = list.size();
          int _minus = (_size_1 - 1);
          IntegerRange _upTo = new IntegerRange(2, _minus);
          for(final Integer idx : _upTo) {
            _builder.append(", ");
            String _tableNameByElement_2 = this.getTableNameByElement(list.get((idx).intValue()).getName(), d);
            _builder.append(_tableNameByElement_2);
            _builder.append(" ");
            String _name_2 = list.get((idx).intValue()).getName();
            _builder.append(_name_2);
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _generateSelectCondition(final FindInstruction stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateSelectCondition(final SingleElement stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      SingleCondition _conditions = stmt.getConditions();
      boolean _tripleNotEquals = (_conditions != null);
      if (_tripleNotEquals) {
        _builder.append("    ");
        _builder.newLine();
        _builder.append("WHERE ");
        String _generateSelectConditions = this.generateSelectConditions(stmt.getConditions());
        _builder.append(_generateSelectConditions);
      }
    }
    return _builder.toString();
  }
  
  protected String _generateSelectConditions(final SingleCondition stmt) {
    StringConcatenation _builder = new StringConcatenation();
    final ArrayList<SingleConditionUnit> list = new ArrayList<SingleConditionUnit>();
    {
      EList<SingleConditionUnit> _conditions = stmt.getConditions();
      for(final SingleConditionUnit f : _conditions) {
        {
          boolean _add = list.add(f);
          if (_add) {
          }
        }
      }
    }
    String _name = list.get(0).getAttributeLeft().getName();
    _builder.append(_name);
    _builder.append(" ");
    String _generateJudgement = this.generateJudgement(list.get(0).getJudgement());
    _builder.append(_generateJudgement);
    _builder.append(" ");
    String _generateRight = this.generateRight(list.get(0));
    _builder.append(_generateRight);
    {
      int _size = list.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        {
          int _size_1 = list.size();
          int _minus = (_size_1 - 1);
          IntegerRange _upTo = new IntegerRange(1, _minus);
          for(final Integer idx : _upTo) {
            _builder.append(" AND ");
            String _name_1 = list.get((idx).intValue()).getAttributeLeft().getName();
            _builder.append(_name_1);
            _builder.append(" ");
            String _generateJudgement_1 = this.generateJudgement(list.get((idx).intValue()).getJudgement());
            _builder.append(_generateJudgement_1);
            _builder.append(" ");
            String _generateRight_1 = this.generateRight(list.get((idx).intValue()));
            _builder.append(_generateRight_1);
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String generateJudgement(final String stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (((stmt.equals("is") || stmt.equals("as")) || stmt.equals("equals"))) {
        _builder.append("=");
      }
    }
    {
      if ((stmt.equals("is not") || stmt.equals("not equals"))) {
        _builder.append("<>");
      }
    }
    {
      boolean _equals = stmt.equals("is larger than");
      if (_equals) {
        _builder.append(">");
      }
    }
    {
      boolean _equals_1 = stmt.equals("is less than");
      if (_equals_1) {
        _builder.append("<");
      }
    }
    {
      boolean _equals_2 = stmt.equals("no larger than");
      if (_equals_2) {
        _builder.append("<=");
      }
    }
    {
      boolean _equals_3 = stmt.equals("no less than");
      if (_equals_3) {
        _builder.append(">=");
      }
    }
    return _builder.toString();
  }
  
  public String generateRight(final SingleConditionUnit stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Attribute _attributeRight = stmt.getAttributeRight();
      boolean _tripleNotEquals = (_attributeRight != null);
      if (_tripleNotEquals) {
        String _name = stmt.getAttributeRight().getName();
        _builder.append(_name);
      }
    }
    {
      BasicVar _value = stmt.getValue();
      boolean _tripleNotEquals_1 = (_value != null);
      if (_tripleNotEquals_1) {
        {
          String _string = stmt.getValue().getString();
          boolean _tripleNotEquals_2 = (_string != null);
          if (_tripleNotEquals_2) {
            _builder.append("\'");
            String _string_1 = stmt.getValue().getString();
            _builder.append(_string_1);
            _builder.append("\'");
          }
        }
        {
          String _string_2 = stmt.getValue().getString();
          boolean _tripleEquals = (_string_2 == null);
          if (_tripleEquals) {
            int _integer = stmt.getValue().getInteger();
            _builder.append(_integer);
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _generateSelectCondition(final JointElement stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      JointCondition _conditions = stmt.getConditions();
      boolean _tripleNotEquals = (_conditions != null);
      if (_tripleNotEquals) {
        _builder.append("        ");
        _builder.newLine();
        _builder.append("WHERE ");
        String _generateSelectConditions = this.generateSelectConditions(stmt.getConditions());
        _builder.append(_generateSelectConditions);
      }
    }
    return _builder.toString();
  }
  
  protected String _generateSelectConditions(final JointCondition stmt) {
    StringConcatenation _builder = new StringConcatenation();
    final ArrayList<JointConditionUnit> list = new ArrayList<JointConditionUnit>();
    {
      EList<JointConditionUnit> _conditions = stmt.getConditions();
      for(final JointConditionUnit f : _conditions) {
        {
          boolean _add = list.add(f);
          if (_add) {
          }
        }
      }
    }
    String _name = list.get(0).getElementLeft().getElement().getName();
    _builder.append(_name);
    _builder.append(".");
    String _name_1 = list.get(0).getElementLeft().getAttribute().getName();
    _builder.append(_name_1);
    _builder.append(" ");
    String _generateJudgement = this.generateJudgement(list.get(0).getJudgement());
    _builder.append(_generateJudgement);
    _builder.append(" ");
    String _generateRight = this.generateRight(list.get(0));
    _builder.append(_generateRight);
    {
      int _size = list.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        {
          int _size_1 = list.size();
          int _minus = (_size_1 - 1);
          IntegerRange _upTo = new IntegerRange(1, _minus);
          for(final Integer idx : _upTo) {
            _builder.append(" AND ");
            String _name_2 = list.get((idx).intValue()).getElementLeft().getElement().getName();
            _builder.append(_name_2);
            _builder.append(".");
            String _name_3 = list.get((idx).intValue()).getElementLeft().getAttribute().getName();
            _builder.append(_name_3);
            _builder.append(" ");
            String _generateJudgement_1 = this.generateJudgement(list.get((idx).intValue()).getJudgement());
            _builder.append(_generateJudgement_1);
            _builder.append(" ");
            String _generateRight_1 = this.generateRight(list.get((idx).intValue()));
            _builder.append(_generateRight_1);
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String generateRight(final JointConditionUnit stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      AttributeOfElement _elementRight = stmt.getElementRight();
      boolean _tripleNotEquals = (_elementRight != null);
      if (_tripleNotEquals) {
        String _name = stmt.getElementRight().getElement().getName();
        _builder.append(_name);
        _builder.append(".");
        String _name_1 = stmt.getElementRight().getAttribute().getName();
        _builder.append(_name_1);
      }
    }
    {
      BasicVar _value = stmt.getValue();
      boolean _tripleNotEquals_1 = (_value != null);
      if (_tripleNotEquals_1) {
        {
          String _string = stmt.getValue().getString();
          boolean _tripleNotEquals_2 = (_string != null);
          if (_tripleNotEquals_2) {
            _builder.append("\'");
            String _string_1 = stmt.getValue().getString();
            _builder.append(_string_1);
            _builder.append("\'");
          }
        }
        {
          String _string_2 = stmt.getValue().getString();
          boolean _tripleEquals = (_string_2 == null);
          if (_tripleEquals) {
            int _integer = stmt.getValue().getInteger();
            _builder.append(_integer);
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _generateSqlStatement(final DeleteInstruction stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DELETE FROM ");
    String _tableNameByElement = this.getTableNameByElement(stmt.getElement().getName(), d);
    _builder.append(_tableNameByElement);
    String _generateDeleteCondition = this.generateDeleteCondition(stmt, d);
    _builder.append(_generateDeleteCondition);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generateDeleteCondition(final DeleteInstruction stmt, final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      SingleCondition _conditions = stmt.getConditions();
      boolean _tripleNotEquals = (_conditions != null);
      if (_tripleNotEquals) {
        _builder.append("    ");
        _builder.newLine();
        _builder.append("WHERE ");
        String _generateSelectConditions = this.generateSelectConditions(stmt.getConditions());
        _builder.append(_generateSelectConditions);
      }
    }
    return _builder.toString();
  }
  
  public CharSequence compile(final Database d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE DATABASE ");
    String _name = d.getName();
    _builder.append(_name);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Instructions> _instructions = d.getInstructions();
      for(final Instructions f : _instructions) {
        String _generateTable = this.generateTable(f, d);
        _builder.append(_generateTable);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Instructions> _instructions_1 = d.getInstructions();
      for(final Instructions f_1 : _instructions_1) {
        String _generateSqlStatement = this.generateSqlStatement(f_1, d);
        _builder.append(_generateSqlStatement);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    return _builder;
  }
  
  public String generateAttribute(final Instructions stmt, final String name) {
    if (stmt instanceof CreateAttributeInstruction) {
      return _generateAttribute((CreateAttributeInstruction)stmt, name);
    } else if (stmt != null) {
      return _generateAttribute(stmt, name);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt, name).toString());
    }
  }
  
  public String generateTable(final Instructions stmt, final Database d) {
    if (stmt instanceof CreateTableInstruction) {
      return _generateTable((CreateTableInstruction)stmt, d);
    } else if (stmt != null) {
      return _generateTable(stmt, d);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt, d).toString());
    }
  }
  
  public String generateSqlStatement(final Instructions stmt, final Database d) {
    if (stmt instanceof AddInstruction) {
      return _generateSqlStatement((AddInstruction)stmt, d);
    } else if (stmt instanceof DeleteInstruction) {
      return _generateSqlStatement((DeleteInstruction)stmt, d);
    } else if (stmt instanceof FindInstruction) {
      return _generateSqlStatement((FindInstruction)stmt, d);
    } else if (stmt != null) {
      return _generateSqlStatement(stmt, d);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt, d).toString());
    }
  }
  
  public String getTableNameByElement(final String elementName, final Database d) {
    return _getTableNameByElement(elementName, d);
  }
  
  public String getInsertAttributes(final InsertInstruction stmt) {
    return _getInsertAttributes(stmt);
  }
  
  public String getInsertValues(final InsertInstruction stmt, final Database d, final String elementName) {
    return _getInsertValues(stmt, d, elementName);
  }
  
  public String generateSelectTarget(final FindInstruction stmt, final Database d) {
    if (stmt instanceof JointElement) {
      return _generateSelectTarget((JointElement)stmt, d);
    } else if (stmt instanceof SingleElement) {
      return _generateSelectTarget((SingleElement)stmt, d);
    } else if (stmt != null) {
      return _generateSelectTarget(stmt, d);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt, d).toString());
    }
  }
  
  public String generateSelectTargets(final Target stmt) {
    return _generateSelectTargets(stmt);
  }
  
  public String generateTableNameByElement(final FindInstruction stmt, final Database d) {
    if (stmt instanceof JointElement) {
      return _generateTableNameByElement((JointElement)stmt, d);
    } else if (stmt instanceof SingleElement) {
      return _generateTableNameByElement((SingleElement)stmt, d);
    } else if (stmt != null) {
      return _generateTableNameByElement(stmt, d);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt, d).toString());
    }
  }
  
  public String generateSelectCondition(final FindInstruction stmt, final Database d) {
    if (stmt instanceof JointElement) {
      return _generateSelectCondition((JointElement)stmt, d);
    } else if (stmt instanceof SingleElement) {
      return _generateSelectCondition((SingleElement)stmt, d);
    } else if (stmt != null) {
      return _generateSelectCondition(stmt, d);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt, d).toString());
    }
  }
  
  public String generateSelectConditions(final EObject stmt) {
    if (stmt instanceof JointCondition) {
      return _generateSelectConditions((JointCondition)stmt);
    } else if (stmt instanceof SingleCondition) {
      return _generateSelectConditions((SingleCondition)stmt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt).toString());
    }
  }
  
  public String generateDeleteCondition(final DeleteInstruction stmt, final Database d) {
    return _generateDeleteCondition(stmt, d);
  }
}