/**
 * generated by Xtext
 */
package vary.pseudocodigo.dsl.c.ui.outline;

import com.google.common.base.Objects;
import diagramapseudocodigo.Algoritmo;
import diagramapseudocodigo.Archivo;
import diagramapseudocodigo.Constantes;
import diagramapseudocodigo.Declaracion;
import diagramapseudocodigo.Funcion;
import diagramapseudocodigo.Implementacion;
import diagramapseudocodigo.Inicio;
import diagramapseudocodigo.Matriz;
import diagramapseudocodigo.Modulo;
import diagramapseudocodigo.Procedimiento;
import diagramapseudocodigo.Registro;
import diagramapseudocodigo.Subproceso;
import diagramapseudocodigo.TipoComplejo;
import diagramapseudocodigo.Vector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
@SuppressWarnings("all")
public class VaryGrammarOutlineTreeProvider extends DefaultOutlineTreeProvider {
  protected void _createChildren(final IOutlineNode parentNode, final Inicio modelElement) {
    EList<Declaracion> _declaracion = modelElement.getDeclaracion();
    for (final Declaracion declaracion : _declaracion) {
      super._createChildren(parentNode, declaracion);
    }
  }
  
  protected void _createChildren(final IOutlineNode parentNode, final Procedimiento modelElement) {
    EList<Declaracion> _declaracion = modelElement.getDeclaracion();
    for (final Declaracion declaracion : _declaracion) {
      super._createChildren(parentNode, declaracion);
    }
  }
  
  protected void _createChildren(final IOutlineNode parentNode, final Funcion modelElement) {
    EList<Declaracion> _declaracion = modelElement.getDeclaracion();
    for (final Declaracion declaracion : _declaracion) {
      super._createChildren(parentNode, declaracion);
    }
  }
  
  protected Object _createChildren(final IOutlineNode parentNode, final Vector modelElement) {
    return null;
  }
  
  protected Object _createChildren(final IOutlineNode parentNode, final Matriz modelElement) {
    return null;
  }
  
  protected void _createChildren(final IOutlineNode parentNode, final Registro modelElement) {
    EList<Declaracion> _variable = modelElement.getVariable();
    for (final Declaracion declaracion : _variable) {
      super._createChildren(parentNode, declaracion);
    }
  }
  
  protected Object _createChildren(final IOutlineNode parentNode, final Constantes modelElement) {
    return null;
  }
  
  protected Object _createChildren(final IOutlineNode parentNode, final Archivo modelElement) {
    return null;
  }
  
  protected void _createChildren(final IOutlineNode parentNode, final Algoritmo modelElement) {
    EList<Modulo> _importaciones = modelElement.getImportaciones();
    for (final Modulo modulo : _importaciones) {
      super._createNode(parentNode, modulo);
    }
    EList<Constantes> _constantes = modelElement.getConstantes();
    for (final Constantes constante : _constantes) {
      super._createNode(parentNode, constante);
    }
    EList<TipoComplejo> _tipocomplejo = modelElement.getTipocomplejo();
    for (final TipoComplejo tipoComplejo : _tipocomplejo) {
      super._createNode(parentNode, tipoComplejo);
    }
    EList<Declaracion> _global = modelElement.getGlobal();
    for (final Declaracion declaracion : _global) {
      super._createChildren(parentNode, declaracion);
    }
    EList<Subproceso> _funcion = modelElement.getFuncion();
    for (final Subproceso subproceso : _funcion) {
      super._createNode(parentNode, subproceso);
    }
    Inicio _tiene = modelElement.getTiene();
    boolean _notEquals = (!Objects.equal(_tiene, null));
    if (_notEquals) {
      Inicio _tiene_1 = modelElement.getTiene();
      super._createNode(parentNode, _tiene_1);
    }
  }
  
  protected void _createChildren(final IOutlineNode parentNode, final Modulo modelElement) {
    EList<Modulo> _importaciones = modelElement.getImportaciones();
    for (final Modulo modulo : _importaciones) {
      super._createNode(parentNode, modulo);
    }
    Implementacion _implementacion = modelElement.getImplementacion();
    EList<Constantes> _constantes = _implementacion.getConstantes();
    for (final Constantes constante : _constantes) {
      super._createNode(parentNode, constante);
    }
    Implementacion _implementacion_1 = modelElement.getImplementacion();
    EList<TipoComplejo> _tipocomplejo = _implementacion_1.getTipocomplejo();
    for (final TipoComplejo tipoComplejo : _tipocomplejo) {
      super._createNode(parentNode, tipoComplejo);
    }
    Implementacion _implementacion_2 = modelElement.getImplementacion();
    EList<Declaracion> _global = _implementacion_2.getGlobal();
    for (final Declaracion declaracion : _global) {
      super._createChildren(parentNode, declaracion);
    }
    Implementacion _implementacion_3 = modelElement.getImplementacion();
    EList<Subproceso> _funcion = _implementacion_3.getFuncion();
    for (final Subproceso subproceso : _funcion) {
      super._createNode(parentNode, subproceso);
    }
  }
}
