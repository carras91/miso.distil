package miso.distil.codeGenerator.generator

import codeGeneratorModel.Artifact
import codeGeneratorModel.Entity
import codeGeneratorModel.Service

/*
 * Packages to generate and from cloudModelServices
 * 
 * @author Carlos Carrascal
 */
class Names {
	
	/// PACKAGES
		
	// miso/carrascal
	val public RootMisoStri = "miso/carrascal"
	val public RootMisoChar = '''miso.carrascal'''
	
	val public Miso = '''«RootMisoChar».cloudModelServices'''	// miso/carrascal/cloudModelServices
	val public MisoUtils = '''«Miso».utils'''					// miso/carrascal/cloudModelServices/utils
	val public MisoAbstract = '''«Miso».abstractServices'''		// miso/carrascal/cloudModelServices/abstractServices
	val public MisoBasic = '''«MisoAbstract».basic'''			// miso/carrascal/cloudModelServices/abstractServices/basic
	val public MisoHtml = '''«MisoAbstract».htmlCover'''		// miso/carrascal/cloudModelServices/abstractServices/htmlCover
	val public MisoServices = '''«MisoAbstract».services'''		// miso/carrascal/cloudModelServices/abstractServices/services

	// miso/distil
	val public RootStri = "miso/distil"
	val public RootChar = '''miso.distil'''

	// miso/distil/entities
	val public EntitiesStr = RootStri + "/entities"
	val public EntitiesCha = '''«RootChar».entities'''
	
	// miso/distil/services
	val public ServicesStr = RootStri + "/services"
	val public ServicesCha = '''«RootChar».services'''
	
	// miso/distil/ejemploServices
	def getArtifactStri(Artifact artifact) { return RootStri + "/" + artifact.name.toLowerCase + 'Services'}	
	def getArtifactChar(Artifact artifact) '''«RootChar».«artifact.name.toLowerCase»Services'''	
	
	// miso/distil/ejemploServices/basic
	def getBasicStri(Artifact artifact) { return artifact.getArtifactStri + "/basic" }
	def getBasicChar(Artifact artifact) '''«artifact.getArtifactChar».basic'''
	
	// miso/distil/ejemploServices/htmlCover
	def getHtmlStri(Artifact artifact) { return artifact.getArtifactStri + "/htmlCover" }
	def getHtmlChar(Artifact artifact) '''«artifact.getArtifactChar».htmlCover'''
	
	/// FILES
	
	// BASIC
	
	// BasicEjemploCodes.java
	def private getBCodes(Artifact artifact) { return "Basic" + artifact.name + "Codes"}
	// miso/distil/ejemploServices/basic/BasicEjemploCodes.java
	def getBCodesFileStri(Artifact artifact) { return artifact.basicStri + "/" + artifact.BCodes }
	def getBCodesFileChar(Artifact artifact) '''«artifact.basicChar».«artifact.BCodes»'''
	
	// BasicEjemploParam.java
	def private getBParam(Artifact artifact) { return "Basic" + artifact.name + "Param"}
	// miso/distil/ejemploServices/basic/BasicEjemploParam.java
	def getBParamFileStri(Artifact artifact) { return artifact.basicStri + "/" + artifact.BParam }
	def getBParamFileChar(Artifact artifact) '''«artifact.basicChar».«artifact.BParam»'''
	
	// BasicEjemploSpark.java
	def private getBSpark(Artifact artifact) { return "Basic" + artifact.name + "Spark"}
	// miso/distil/ejemploServices/basic/BasicEjemploSpark.java
	def getBSparkFileStri(Artifact artifact) { return artifact.basicStri + "/" + artifact.BSpark }
	def getBSparkFileChar(Artifact artifact) '''«artifact.basicChar».«artifact.BSpark»'''
	
	// HTML
	
	// HtmlEjemploJson.java
	def private getHJson(Artifact artifact) { return "Html" + artifact.name + "Json"}
	// miso/distil/ejemploServices/htmlCover/HtmlEjemploJson.java
	def getHJsonFileStri(Artifact artifact) { return artifact.htmlStri + "/" + artifact.HJson }
	def getHJsonFileChar(Artifact artifact) '''«artifact.htmlChar».«artifact.HJson»'''
	
	// HtmlEjemploLinks.java
	def private getHLinks(Artifact artifact) { return "Html" + artifact.name + "Links"}
	// miso/distil/ejemploServices/htmlCover/HtmlEjemploLinks.java
	def getHLinksFileStri(Artifact artifact) { return artifact.htmlStri + "/" + artifact.HLinks }
	def getHLinksFileChar(Artifact artifact) '''«artifact.htmlChar».«artifact.HLinks»'''
	
	// HtmlEjemploSpark.java
	def private getHSpark(Artifact artifact) { return "Html" + artifact.name + "Spark"}
	// miso/distil/ejemploServices/htmlCover/HtmlEjemploSpark.java
	def getHSparkFileStri(Artifact artifact) { return artifact.htmlStri + "/" + artifact.HSpark }
	def getHSparkFileChar(Artifact artifact) '''«artifact.htmlChar».«artifact.HSpark»'''
	
	// HtmlEjemploView.java
	def private getHView(Artifact artifact) { return "Html" + artifact.name + "View"}
	// miso/distil/ejemploServices/htmlCover/HtmlEjemploView.java
	def getHViewFileStri(Artifact artifact) { return artifact.htmlStri + "/" + artifact.HView }
	def getHViewFileChar(Artifact artifact) '''«artifact.htmlChar».«artifact.HView»'''
	
	// ROOT
	
	// Ejemplo.java
	def private getArtifact(Artifact artifact) { return artifact.name }
	// miso/distil/ejemploServices/Ejemplo.java
	def getArtifactFileStri(Artifact artifact) { return artifact.artifactStri + "/" + artifact.artifact }
	def getArtifactFileChar(Artifact artifact) '''«artifact.artifactChar».«artifact.artifact»'''
	
	// EjemploJson.java
	def private getArtifactJson(Artifact artifact) { return artifact.name + "Json"}
	// miso/distil/ejemploServices/EjemploJson.java
	def getArtifactJsonFileStri(Artifact artifact) { return artifact.artifactStri + "/" + artifact.artifactJson }
	def getArtifactJsonFileChar(Artifact artifact) '''«artifact.artifactChar».«artifact.artifactJson»'''
	
	// CustomEjemploHtml.java
	def private getArtifactCustom(Artifact artifact) { return "Custom" + artifact.name + "Html"}
	// miso/distil/ejemploServices/CustomEjemploHtml.java
	def getArtifactCustomFileStri(Artifact artifact) { return artifact.artifactStri + "/" + artifact.artifactCustom }
	def getArtifactCustomFileChar(Artifact artifact) '''«artifact.artifactChar».«artifact.artifactCustom»'''
	
	/// ENTITIES
	
	// Ejemplo.java
	def private getEntity(Entity entity) { return entity.name }
	// miso/distil/entities/Ejemplo.java
	def getEntityFileStri(Entity entity) { return EntitiesStr + "/" + entity.entity }
	def getEntityFileChar(Entity entity) '''«EntitiesCha».«entity.entity»'''
	
	/// SERVICES
	
	// ServiceEjemplo.java
	def private getService(Service service) { return "Service" + service.name }
	// miso/distil/services/ServiceEjemplo.java
	def getServiceFileStri(Service service) { return ServicesStr + "/" + service.service }
	def getServiceFileChar(Service service) '''«ServicesCha».«service.service»'''
	
	// ServicesSpark.java
	def private getServicesSpark() { return "ServicesSpark"}
	// miso/distil/services/ServicesSpark.java
	def getServicesSparkFileStri() { return ServicesStr + "/"+ servicesSpark }
	def getServicesSparkFileChar() '''«ServicesCha».«servicesSpark»'''
	
	/// MAIN
	
	// Main.java
	def private getMain() { return "Main"}
	// miso/distil/Main.java
	def getMainFileStri() { return RootStri + "/" + main }
	def getMainFileChar() '''«RootChar».«main»'''
	
	/// DB
	
	// CustomDB.java
	def private getDB() { return "CustomDB"}
	// miso/distil/CustomDB.java
	def getDBFileStri() { return RootStri + "/" + DB }
	def getDBFileChar() '''«RootChar».«DB»'''
	
	
	
	
	
	
}