package miso.carrascal.codeGenerator.generator.entities

import codeGeneratorModel.Attribute
import codeGeneratorModel.Artifact
import com.google.inject.Inject
import org.eclipse.emf.common.util.EList
//import codeGeneratorModel.Reference

class generateArtifactClass {

	@Inject miso.carrascal.codeGenerator.generator.generateUtils genUti
	@Inject miso.carrascal.codeGenerator.generator.packages pack
	
	def write(Artifact artifact) '''
		«val EList<Attribute> atts = artifact.attributes»
«««		«val EList<Reference> refs = artifact.references»
		package «pack.getArtifactChar(artifact)»;

		import «pack.MisoAbstract».AbstractPersistentClass;
		
		«genUti.getImportCompose(atts)»
		import java.util.List;

		public class «artifact.name» extends AbstractPersistentClass {

			private static final long serialVersionUID = 1L;
			«genUti.getPrivateAttributes(atts)»
«««			«genUti.getPrivateReferences(refs)»

			public «artifact.name»() {
				super();
			}

			«artifact.getConstructorArtifact»

			«genUti.getGetSetAtt(atts)»
			
«««			«genUti.getGetSetRef(refs)»
«««			«genUti.getToStringRefs(atts,refs)»
			«genUti.getToStringAtts(atts)»
		}
	'''
	
	def private getConstructorArtifact(Artifact artifact) '''
		«val EList<Attribute> atts = artifact.attributes»
«««		«val EList<Reference> refs = artifact.references»
«««		public «artifact.name»(String objectName, long fileSize, List<String> tags«FOR att:atts», «genUti.getTypeName(att)» «att.name»«ENDFOR»«FOR ref:refs», «genUti.getTypeName(ref)» «ref.name»«ENDFOR») {
		public «artifact.name»(String objectName, long fileSize, List<String> tags«FOR att:atts», «genUti.getTypeName(att)» «att.name»«ENDFOR») {

			super(objectName, fileSize, tags);

			«FOR att:atts» 
				this.«att.name» = «att.name»;
			«ENDFOR»
«««			«FOR ref:refs» 
«««				this.«ref.name» = «ref.name»;
«««			«ENDFOR»
		}
	'''	
}