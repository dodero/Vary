/*
* generated by Xtext
*/
package vary.pseudocodigo.dsl.c.ui.labeling

import com.google.inject.Inject
import diagramapseudocodigo.Modulo
import diagramapseudocodigo.Procedimiento
import org.eclipse.xtext.EcoreUtil2
import diagramapseudocodigo.Algoritmo
import diagramapseudocodigo.CabeceraProcedimiento
import java.util.List
import diagramapseudocodigo.ParametroFuncion
import diagramapseudocodigo.TipoExistente
import diagramapseudocodigo.Funcion
import diagramapseudocodigo.TipoDefinido
import diagramapseudocodigo.CabeceraFuncion
import diagramapseudocodigo.Declaracion
import diagramapseudocodigo.DeclaracionVariable
import diagramapseudocodigo.Variable
import diagramapseudocodigo.Inicio
import diagramapseudocodigo.DeclaracionPropia
import diagramapseudocodigo.TipoComplejo
import diagramapseudocodigo.Vector
import diagramapseudocodigo.NumeroEntero
import diagramapseudocodigo.VariableID
import diagramapseudocodigo.Matriz
import diagramapseudocodigo.Subrango
import diagramapseudocodigo.SubrangoEnumerado
import diagramapseudocodigo.SubrangoNumerico
import diagramapseudocodigo.Constantes
import diagramapseudocodigo.cadena
import diagramapseudocodigo.ConstCadena
import diagramapseudocodigo.Caracter
import diagramapseudocodigo.NumeroDecimal
import diagramapseudocodigo.ValorBooleano
import diagramapseudocodigo.Registro
import diagramapseudocodigo.Enumerado
import diagramapseudocodigo.Archivo
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.ui.label.StylerFactory

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class VaryGrammarLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {
	@Inject 
	private StylerFactory stylerFactory;
	@Inject
	new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	//Definición de colores para los nodos---------------------------------------------------------------------------------
	
	def protected TextStyle getAlgoritmoTextStyle() {
 		var textStyle = new TextStyle();
  		textStyle.setColor(new RGB(220, 20, 60));
 		textStyle.setStyle(SWT.ITALIC);
  		return textStyle;
	}
	
	def protected TextStyle getPrincipalesTextStyle() {
 		var textStyle = new TextStyle();
  		textStyle.setColor(new RGB(0, 0, 139));
 		textStyle.setStyle(SWT.ITALIC);
  		return textStyle;
	}
	
	def protected TextStyle getTiposTextStyle() {
 		var textStyle = new TextStyle();
  		textStyle.setColor(new RGB(139, 0, 139));
 		textStyle.setStyle(SWT.ITALIC);
  		return textStyle;
	}
	
	def protected TextStyle getDeclaracionTextStyle() {
 		var textStyle = new TextStyle();
  		textStyle.setColor(new RGB(205, 155, 29));
 		textStyle.setStyle(SWT.ITALIC);
  		return textStyle;
	}
	
	//Definición de las imágenes y textos para los nodos-------------------------------------------------------------------
	
	def text(Modulo modulo) {
		return new StyledString(modulo.nombre, stylerFactory.createXtextStyleAdapterStyler(getAlgoritmoTextStyle()));
	}
	
	def image(Modulo modulo) {
		'modulo.gif'
	}
	
	def text(Registro registro) {
		return new StyledString(registro.nombre, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
	}
	
	def text(Archivo archivo) {
		var tipo = new String()
		if(archivo.tipo instanceof TipoExistente) {
			var tipoAux = archivo.tipo as TipoExistente
			tipo = tipoAux.tipo.literal
		} else {
			var tipoAux = archivo.tipo as TipoDefinido
			tipo = tipoAux.tipo
		}
		return new StyledString(archivo.nombre + ' : ' + tipo, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
	}
	
	def image(TipoComplejo tipoComplejo) {
		var modulo = EcoreUtil2.getContainerOfType(tipoComplejo, Modulo)
		if(modulo == null) { //Es del algoritmo
			'typevariable_private.gif'
		}
		else {
			var nombre = new String()
			if(tipoComplejo instanceof Vector) {
				var vector = tipoComplejo as Vector
				nombre = vector.nombre
			} else if(tipoComplejo instanceof Matriz) {
				var matriz = tipoComplejo as Matriz
				nombre = matriz.nombre
			} else if(tipoComplejo instanceof Registro) {
				var registro = tipoComplejo as Registro
				nombre = registro.nombre
			} else if(tipoComplejo instanceof Enumerado) {
				var enumerado = tipoComplejo as Enumerado
				nombre = enumerado.nombre
			} else if(tipoComplejo instanceof Archivo) {
				var archivo = tipoComplejo as Archivo
				nombre = archivo.nombre
			} else {
				var subrango = tipoComplejo as Subrango
				nombre = subrango.nombre
			}
			if(modulo.exporta_tipos.contains(nombre)) {
				'typevariable_public.gif'
			}
			else {
				'typevariable_private.gif'
			}
		}
	}
	
	def text(Vector vector) {
		if(vector.tipo instanceof TipoExistente) {
			var tipo = vector.tipo as TipoExistente
			if(vector.valor instanceof NumeroEntero) {
				var indice = vector.valor as NumeroEntero
				return new StyledString(vector.nombre + '[' + indice.valor + '] : ' + tipo.tipo.literal + ' : ' + tipo, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
			}
			else {
				var indice = vector.valor as VariableID
				return new StyledString(vector.nombre + '[' + indice.nombre + '] : ' + tipo.tipo.literal, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
			}
		}
		else {
			var tipo = vector.tipo as TipoDefinido
			if(vector.valor instanceof NumeroEntero) {
				var indice = vector.valor as NumeroEntero
				return new StyledString(vector.nombre + '[' + indice.valor + '] : ' + tipo.tipo, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
			}
			else {
				var indice = vector.valor as VariableID
				return new StyledString(vector.nombre + '[' + indice.nombre + '] : ' + tipo.tipo, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
			}
		}
	}
	
	def image(Constantes constante) {
		var modulo = EcoreUtil2.getContainerOfType(constante, Modulo)
		if(modulo == null) { //Es del algoritmo
			'compare_field_private.gif'
		} else {
			if(modulo.exporta_constantes.contains(constante.variable.nombre)) {
				'compare_field_public.gif'
			} else {
				'compare_field_private.gif'
			}
		}
	}
	
	def text(Constantes constantes) {
		var valor = new String()
		if(constantes.valor instanceof NumeroEntero) {
			var numero = constantes.valor as NumeroEntero
			valor = numero.valor.toString
		}
		else if(constantes.valor instanceof ConstCadena) {
			var cadena = constantes.valor as ConstCadena
			valor = cadena.contenido
		}
		else if(constantes.valor instanceof Caracter) {
			var caracter = constantes.valor as Caracter
			valor = caracter.contenido
		}
		else if(constantes.valor instanceof NumeroDecimal) {
			var real = constantes.valor as NumeroDecimal
			valor = real.valor.toString
		}
		else if(constantes.valor instanceof ValorBooleano) {
			var logico = constantes.valor as ValorBooleano
			valor = logico.valor.literal
		}
		else if(constantes.valor instanceof VariableID) {
			var variable = constantes.valor as VariableID
			valor = variable.nombre
		}
		return new StyledString(constantes.variable.nombre + ' ' + valor, stylerFactory.createXtextStyleAdapterStyler(getPrincipalesTextStyle()));
	}
	
	def text(Matriz matriz) {
		if(matriz.tipo instanceof TipoExistente) {
			var tipo = matriz.tipo as TipoExistente
			var indice1 = new String()
			var indice2 = new String()
			if(matriz.valor.size() > 0) {
				if(matriz.valor.get(0) instanceof NumeroEntero) {
					var indice = matriz.valor.get(0) as NumeroEntero
					indice1 = indice.valor.toString
				}
				else {
					var indice = matriz.valor.get(0) as VariableID
					indice1 = indice.nombre
				}
			}
			if(matriz.valor.size() > 1) {
				if(matriz.valor.get(1) instanceof NumeroEntero) {
					var indice = matriz.valor.get(1) as NumeroEntero
					indice2 = indice.valor.toString
				}
				else {
					var indice = matriz.valor.get(1) as VariableID
					indice2 = indice.nombre
				}
			}
			return new StyledString(matriz.nombre + '[' + indice1 + '][' + indice2 + '] : ' + tipo.tipo.literal, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
		}
		else {
			var tipo = matriz.tipo as TipoDefinido
			var indice1 = new String()
			var indice2 = new String()
			if(matriz.valor.size() > 0) {
				if(matriz.valor.get(0) instanceof NumeroEntero) {
					var indice = matriz.valor.get(0) as NumeroEntero
					indice1 = indice.valor.toString
				}
				else {
					var indice = matriz.valor.get(0) as VariableID
					indice1 = indice.nombre
				}
			}
			if(matriz.valor.size() > 1) {
				if(matriz.valor.get(1) instanceof NumeroEntero) {
					var indice = matriz.valor.get(1) as NumeroEntero
					indice2 = indice.valor.toString
				}
				else {
					var indice = matriz.valor.get(1) as VariableID
					indice2 = indice.nombre
				}
			}
			return new StyledString(matriz.nombre + '[' + indice1 + '][' + indice2 + '] : ' + tipo.tipo, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
		}
	}
	
	def image(Inicio inicio) {
		'envvar_obj.gif'
	}
	
	def text(Inicio inicio) {
		return new StyledString('Principal', stylerFactory.createXtextStyleAdapterStyler(getPrincipalesTextStyle()));
	}
	
	def image(VariableID variableID) {
		'compare_field.gif'
	}
	
	def text(Enumerado enumerado) {
		return new StyledString(enumerado.nombre, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
	}
	
	def text(SubrangoEnumerado subrango) {
		return new StyledString(subrango.nombre + ' [' + subrango.limite_inf + ',' + subrango.limite_sup + ']', stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
	}
	
	def text(SubrangoNumerico subrango) {
		return new StyledString(subrango.nombre + ' [' + subrango.limite_inf + ',' + subrango.limite_sup + ']', stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
	}
	
	def text(Funcion funcion) {
		return new StyledString(funcion.nombre + '(' + cadenaTiposSubproceso(funcion.parametrofuncion) + ') : ' + funcion.tipo.literal, stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
	}
	
	def text(Procedimiento procedimiento) {
		return new StyledString(procedimiento.nombre + '(' + cadenaTiposSubproceso(procedimiento.parametrofuncion) + ')', stylerFactory.createXtextStyleAdapterStyler(getTiposTextStyle()));
	}
	
	def image(Algoritmo algoritmo) {
		'algoritmo.gif'
	}
	
	def text(Algoritmo algoritmo) {
		return new StyledString(algoritmo.nombre, stylerFactory.createXtextStyleAdapterStyler(getAlgoritmoTextStyle()));
	}
	
	def cadenaTiposSubproceso(List<ParametroFuncion> parametros) {
		var tiposParametros = new String()
		for(parametro: parametros) {
			if(parametro.tipo instanceof TipoExistente) {
				var tipo = parametro.tipo as TipoExistente
				tiposParametros = tiposParametros + tipo.tipo.literal
			}
			else {
				var tipo = parametro.tipo as TipoDefinido
				tiposParametros = tiposParametros + tipo.tipo
			}
			if(parametros.indexOf(parametro) != parametros.size - 1) {
				tiposParametros = tiposParametros + ','
			}
		}
		return tiposParametros
	}
	
	def image(Procedimiento procedimiento) {
		var modulo = EcoreUtil2.getContainerOfType(procedimiento, Modulo)
		var algoritmo = EcoreUtil2.getContainerOfType(procedimiento, Algoritmo)
		if(modulo != null) {
			for(cabecera: modulo.exporta_funciones) {
				if(cabecera.nombre.equals(procedimiento.nombre) && cabecera instanceof CabeceraProcedimiento) {
					return 'methpub_obj.gif'
				}
			}
			return 'methpri_obj.gif'
		}
		else if(algoritmo != null) {
			//Si son funciones/procedimientos del algoritmo, no se pueden importar
			'methpri_obj.gif' 
		}
	}
	
	def image(Funcion funcion) {
		var modulo = EcoreUtil2.getContainerOfType(funcion, Modulo)
		var algoritmo = EcoreUtil2.getContainerOfType(funcion, Algoritmo)
		if(modulo != null) {
			for(cabecera: modulo.exporta_funciones) {
				if(cabecera.nombre.equals(funcion.nombre) && cabecera instanceof CabeceraFuncion) {
					return 'methpub_obj.gif'
				}
			}
			return 'methpri_obj.gif'
		}
		else if(algoritmo != null) {
			//Si son funciones/procedimientos del algoritmo, no se pueden importar
			return 'methpri_obj.gif' 
		}
	}
	
	def image(Variable variable) {
		var modulo = EcoreUtil2.getContainerOfType(variable, Modulo)
		var registro = EcoreUtil2.getContainerOfType(variable, Registro)
		
		if(modulo != null) {
			if(registro != null) {
				return 'compare_field.gif'
			}
			var esPublica = new Boolean(false)
			for(declaracion: modulo.exporta_globales) {
				if(declaracion instanceof DeclaracionPropia) {
					var declaracionAux = declaracion as DeclaracionPropia
					for(variableAux: declaracionAux.variable) {
						if(variableAux.nombre.equals(variable.nombre)) {
							esPublica = true
						}
					}
				}else {
					var declaracionAux = declaracion as DeclaracionVariable
					for(variableAux: declaracionAux.variable) {
						if(variableAux.nombre.equals(variable.nombre)) {
							esPublica = true
						}
					}
				}
			}
			if(esPublica) {
				return 'field_public_obj.gif'
			}
			else {
				return 'field_private_obj.gif'
			}
		}
		
		else if(registro != null) {
			return 'compare_field.gif'
		}
		
		else {
			return 'field_private_obj.gif'
		}
	}
	
	def text(Variable variable) {
		var declaracionVariable = EcoreUtil2.getContainerOfType(variable, DeclaracionVariable)
		var declaracionPropia = EcoreUtil2.getContainerOfType(variable, DeclaracionPropia)
		var registro = EcoreUtil2.getContainerOfType(variable, Registro)
		if(declaracionVariable != null && registro == null) {
			return new StyledString(variable.nombre + ' : ' + declaracionVariable.tipo.literal, stylerFactory.createXtextStyleAdapterStyler(getDeclaracionTextStyle()));
		}
		else if(declaracionVariable == null && registro == null) {
			return new StyledString(variable.nombre + ' : ' + declaracionPropia.tipo, stylerFactory.createXtextStyleAdapterStyler(getDeclaracionTextStyle()));
		} else if(declaracionVariable != null && registro != null) {
			return variable.nombre + ' : ' + declaracionVariable.tipo.literal
		} else if(declaracionVariable == null && registro == null) {
			return variable.nombre + ' : ' + declaracionPropia.tipo
		}
	}

	// Labels and icons can be computed like this:
	
//	def text(Greeting ele) {
//		'A greeting to ' + ele.name
//	}
//
//	def image(Greeting ele) {
//		'Greeting.gif'
//	}
}
