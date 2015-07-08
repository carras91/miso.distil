package miso.carrascal.codeGenerator.generator

import codeGeneratorModel.Artifact

/*
 * Packages to generate and from cloudModelServices
 * 
 * @author Carlos Carrascal
 */
class packages {
	
	// miso/carrascal
	val public RootStri = "miso/carrascal"
	val public RootChar = '''miso.carrascal'''
	
	val public Miso = '''«RootChar».cloudModelServices'''		// miso/carrascal/cloudModelServices
	val public MisoUtils = '''«Miso».utils'''					// miso/carrascal/cloudModelServices/utils
	val public MisoAbstract = '''«Miso».abstractServices'''		// miso/carrascal/cloudModelServices/abstractServices
	val public MisoBasic = '''«MisoAbstract».basic'''			// miso/carrascal/cloudModelServices/abstractServices/basic
	val public MisoHtml = '''«MisoAbstract».htmlCover'''		// miso/carrascal/cloudModelServices/abstractServices/htmlCover
	val public MisoServices = '''«MisoAbstract».services'''		// miso/carrascal/cloudModelServices/abstractServices/services
	
	// miso/carrascal/entities
	val public EntitiesStr = RootStri + "/entities"
	val public EntitiesCha = '''«RootChar».entities'''
	
	// miso/carrascal/services
	val public ServicesStr = RootStri + "/services"
	val public ServicesCha = '''«RootChar».services'''
	
	// miso/carrascal/ejemploServices
	def getArtifactStri(Artifact artifact) { return RootStri + "/" + artifact.name.toLowerCase + 'Services'}	
	def getArtifactChar(Artifact artifact) '''«RootChar».«artifact.name.toLowerCase»Services'''	
	
	// miso/carrascal/ejemploServices/basic
	def getBasicStri(Artifact artifact) { return artifact.getArtifactStri + "/basic" }
	def getBasicChar(Artifact artifact) '''«artifact.getArtifactChar».basic'''
	
	// miso/carrascal/ejemploServices/htmlCover
	def getHtmlStri(Artifact artifact) { return artifact.getArtifactStri + "/htmlCover" }
	def getHtmlChar(Artifact artifact) '''«artifact.getArtifactChar».htmlCover'''
}