/*
 * generated by Xtext
 */
package miso.carrascal.codeGenerator.validation

import org.eclipse.xtext.validation.Check
import codeGeneratorModel.CodeGeneratorModelPackage
import codeGeneratorModel.AbstractEntity
import codeGeneratorModel.Attribute
import codeGeneratorModel.Entity
import codeGeneratorModel.Root
import codeGeneratorModel.Artifact
import codeGeneratorModel.MultiAttribute
import java.util.List
import java.util.ArrayList
import codeGeneratorModel.Service
import codeGeneratorModel.ServiceEnum
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.MultiService
import codeGeneratorModel.SimpleService
import org.eclipse.emf.common.util.BasicEList
import codeGeneratorModel.OnService

//import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 * 
 * @author Carlos Carrascal
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RulesValidator extends AbstractRulesValidator {

	public static val INVALID_NAME = 'invalidName'
  	public static val REPEATED_NAME = 'repeatedName'
  	public static val REPEATED_SERVICE = 'repeatedService'
  	public static val INPUT_WRONG = 'wrongInput'
  	public static val INVALID_ATTR = 'invalidAttribute'
  	public static val PROHIBITED_NAME= 'prohibitedName'
  	public static val PROHIBITED_REFERENCE= 'prohibitedReference'
  	public static val EMPTY_CLASS = 'emptyObject'
  	
	@Check
	// Los OnService deben referenciar artifacts que tengan, al menos, los servicios definidos en whenServices
	def chechOnService(OnService onSer) {
		onSer.whenServices.forEach[
			if(onSer.artifact.basicServices != null) {
				if(!onSer.artifact.basicServices.contains(it)) {
					error(' Artifact ' + onSer.artifact.name + ' does not have service ' + it.toString + ' enabled',
						CodeGeneratorModelPackage.Literals.ON_SERVICE__WHEN_SERVICES,
						PROHIBITED_REFERENCE)
				}
			}
		]
	}
	
	@Check
	// Los OnService no pueden tener whenServices repetidos
	def chechOnServiceRepeated(OnService onSer) {
		onSer.whenServices.forEach[
			if(onSer.whenServices.lastIndexOf(it) != onSer.whenServices.indexOf(it)) {
				error('Option ' + it.toString + ' is repeated on positions ' + onSer.whenServices.indexOf(it) + ' and ' + onSer.whenServices.lastIndexOf(it),
					CodeGeneratorModelPackage.Literals.ON_SERVICE__WHEN_SERVICES,
					REPEATED_SERVICE)
			}
		]
	}

	@Check
	// Las entitys no pueden estar encadenadas recursivamente
	def checkMultiAttNotRecursive(Entity ent) {
		var EList<MultiAttribute> atts = getAllNestedMultiAtts(ent.attributes)
		for(att : atts) {
			if(att.type.name.equalsIgnoreCase(ent.name)) {
				error('This entity contains ' + att.name + ', who contains this entity',
					CodeGeneratorModelPackage.Literals.ABSTRACT_ENTITY__NAME,
					PROHIBITED_REFERENCE)
			}
		}
	}
	
	def private EList<MultiAttribute> getAllNestedMultiAtts(EList<Attribute> atts) {
		val EList<MultiAttribute> list = new BasicEList<MultiAttribute>()
		atts.forEach[
			if(it instanceof MultiAttribute) {
				list.addAll(it.type.attributes.getAllNestedMultiAtts)		
				list.add(it)	
			}
		]
		return list
	}

	@Check
	// Los servicios de un MultiService deben tener entradas y salidas exactas
	def checkMultiServiceParameters(MultiService mulSer) {
		if(!mulSer.parallel) {
			var EList<AbstractEntity> out = (mulSer.services.get(0) as Service).output
			for(var int j = 1; j < mulSer.services.size; j++) {
				var service = (mulSer.services as EList<Service>).get(j)
				
				if(out.size != service.getInput.size) {
					error('Service ' + service.name + ' requires ' + service.getInput.size + ' inputs but receives ' + out.size + ' from ' + (mulSer.services as EList<Service>).get(j-1).name, 
							CodeGeneratorModelPackage.Literals.MULTI_SERVICE__SERVICES,
							INPUT_WRONG)
				}
				
				for(var int i = 0; i<service.getInput.size; i++) {
					if(!out.get(i).equals(service.getInput.get(i))) {
						error('Input ' + i + ' of service ' + service.name + ' requires ' + service.getInput.get(i).name + ' but ' + out.get(i).name + ' given', 
							CodeGeneratorModelPackage.Literals.MULTI_SERVICE__SERVICES,
							INPUT_WRONG)
					}
				}
				out = service.getOutput
			}
		}
	}
	
	private def EList<Artifact> getInput(Service service) {
		if(service instanceof SimpleService) {
			return service.input
		}
		else if(service instanceof MultiService) {
			if(service.parallel) {
				var EList<Artifact> input = new BasicEList<Artifact>()
				for(ser : service.services as EList<Service>) {
					input.addAll(ser.getInput)
				}
				return input
			} else {
				return (service.services.get(0) as Service).getInput
			}
		}
	}
	
	private def EList<AbstractEntity> getOutput(Service service) {
		if(service instanceof SimpleService) {
			return service.output
		}
		else if(service instanceof MultiService) {
			if(service.parallel) {
				var EList<AbstractEntity> output = new BasicEList<AbstractEntity>()
				for(ser : service.services as EList<Service>) {
					output.addAll(ser.getOutput)
				}
				return output
			} else {
				return (service.services.last as Service).getOutput
			}
		}
	}

	@Check
	// Las clases deben comenzar por mayuscula
	def checkEntityStartsWithCapital(AbstractEntity ent) {	
		if (!Character.isUpperCase(ent.name.charAt(0))) {
			error('Identifier should start with a capital', 
				CodeGeneratorModelPackage.Literals.ABSTRACT_ENTITY__NAME,
				INVALID_NAME)
		}
	}
	
	@Check
	// Los atributos deben comenzar por minuscula
	def checkAttributeStartsWithLower(Attribute att) {	
		if (!Character.isLowerCase(att.name.charAt(0))) {
			error('Identifier should start with a low case', 
				CodeGeneratorModelPackage.Literals.ATTRIBUTE__NAME,
				INVALID_NAME)
		}
	}
	
//	@Check
//	// Las referencias deben comenzar por minuscula
//	def checkReferenceStartsWithLower(Reference ref) {	
//		if (!Character.isLowerCase(ref.name.charAt(0))) {
//			error('Identifier should start with a low case', 
//				CodeGeneratorModelPackage.Literals.REFERENCE__NAME,
//				INVALID_NAME)
//		}
//	}
	
	@Check
	// Los servicios deben comenzar por mayuscula
	def checkServiceStartsWithLower(Service ser) {	
		if (!Character.isUpperCase(ser.name.charAt(0))) {
			error('Identifier should start with a capital', 
				CodeGeneratorModelPackage.Literals.SERVICE__NAME,
				INVALID_NAME)
		}
	}
		
	@Check
	// Los artifact no pueden repetir servicios basicos
	def checkArtifactDontRepeatBasicServices(Artifact  art) {
		val List<ServiceEnum> services = new ArrayList<ServiceEnum>()
		for(service : art.basicServices as EList<ServiceEnum>) {
			if(services.contains(service)) {
				error(service.name + ' is repeated',
					CodeGeneratorModelPackage.Literals.ARTIFACT__BASIC_SERVICES,
					REPEATED_SERVICE)
			} else {
				services.add(service)
			}
		}
	}
	
	@Check
	// Todos los nombres deben ser unicos
	def checkUniqueNames(Root root) {
		val List<String> names = new ArrayList<String>()
		
		(root.artifacts as EList<Artifact>).forEach[
			if(names.contains(it.name)) {
				error('Name ' + it.name + ' is repeated',
					CodeGeneratorModelPackage.Literals.ROOT__ARTIFACTS,
					REPEATED_NAME)
			} else {
				names.add(it.name.toLowerCase)
			}
			
//			(it.references as EList<Reference>).forEach[
//				if(names.contains(it.name)) {
//					error('Name ' + it.name + ' is repeated',
//						CodeGeneratorModelPackage.Literals.ROOT__ARTIFACTS,
//						REPEATED_NAME)
//				} else {
//					names.add(it.name.toLowerCase)
//				}
//			]
			
			(it.attributes as EList<Attribute>).forEach[
				if(names.contains(it.name)) {
					error('Name ' + it.name + ' is repeated',
						CodeGeneratorModelPackage.Literals.ROOT__ARTIFACTS,
						REPEATED_NAME)
				} else {
					names.add(it.name.toLowerCase)
				}
			]
		]
		
		(root.entities as EList<Entity>).forEach[
			if(names.contains(it.name)) {
				error('Name ' + it.name + ' is repeated',
					CodeGeneratorModelPackage.Literals.ROOT__ENTITIES,
					REPEATED_NAME)
			} else {
				names.add(it.name.toLowerCase)
			}
			
			(it.attributes as EList<Attribute>).forEach[
				if(names.contains(it.name)) {
					error('Name ' + it.name + ' is repeated',
						CodeGeneratorModelPackage.Literals.ROOT__ENTITIES,
						REPEATED_NAME)
				} else {
					names.add(it.name.toLowerCase)
				}
			]
		]
		
		(root.services as EList<Service>).forEach[
			if(names.contains(it.name)) {
				error('Name ' + it.name + ' is repeated',
					CodeGeneratorModelPackage.Literals.ROOT__SERVICES,
					REPEATED_NAME)
			} else {
				names.add(it.name.toLowerCase)
			}
		]
			
	}
	
	@Check
	// Las clases no pueden tener ciertos nombres que ya se usan durante la generacion de codigo
	def checkNamesEntityNotProhibited(AbstractEntity ent) {
		nameVariables.prohibitedNames.forEach[
			if(ent.name.equalsIgnoreCase(it)) {
				error('Name ' + ent.name + ' is prohibited',
					CodeGeneratorModelPackage.Literals.ABSTRACT_ENTITY__NAME,
					PROHIBITED_NAME)
			}
		]
	}
	
	@Check
	// Los atributos no pueden tener ciertos nombres que ya se usan durante la generacion de codigo
	def checkNamesAttributeNotProhibited(Attribute att) {
		nameVariables.prohibitedNames.forEach[
			if(att.name.equalsIgnoreCase(it)) {
				error('Name ' + att.name + ' is prohibited',
					CodeGeneratorModelPackage.Literals.ATTRIBUTE__NAME,
					PROHIBITED_NAME)
			}
		]
	}
	
//	@Check
//	// Las referenciasno pueden tener ciertos nombres que ya se usan durante la generacion de codigo
//	def checkNamesReferenceNotProhibited(Reference ref) {
//		nameVariables.prohibitedNames.forEach[
//			if(ref.name.equalsIgnoreCase(it)) {
//				error('Name ' + ref.name + ' is prohibited',
//					CodeGeneratorModelPackage.Literals.REFERENCE__NAME,
//					PROHIBITED_NAME)
//			}
//		]
//	}
	
	@Check
	// Los servicios no pueden tener ciertos nombres que ya se usan durante la generacion de codigo
	def checkNamesServiceNotProhibited(Service ser) {
		nameVariables.prohibitedNames.forEach[
			if(ser.name.equalsIgnoreCase(it)) {
				error('Name ' + ser.name + ' is prohibited',
					CodeGeneratorModelPackage.Literals.SERVICE__NAME,
					PROHIBITED_NAME)
			}
		]
	}
}