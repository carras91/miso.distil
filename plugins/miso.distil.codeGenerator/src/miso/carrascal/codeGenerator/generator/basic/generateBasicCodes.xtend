package miso.carrascal.codeGenerator.generator.basic

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import org.eclipse.emf.common.util.EList
//import codeGeneratorModel.Reference
import codeGeneratorModel.Attribute

class generateBasicCodes { 
	
	@Inject miso.carrascal.codeGenerator.generator.generateUtils genUti
	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write(Artifact artifact) '''
		«val name = artifact.name»
		«val EList<Attribute> allAtts = genUti.getAllNestedAttributes(artifact.attributes)»
«««		«val EList<Reference> refs = artifact.references»
		«var pos = -1»
		package «pack.getBasicChar(artifact)»;

		import «pack.MisoBasic».BasicAbstractCodes;

		public class Basic«name»Codes extends BasicAbstractCodes {

			public static String Param_error = "ParameterError : Parameter is incorrect";
			«{pos = -1; null}»
			«FOR att:allAtts»
				«{pos++; null}»
				public static String Param_«genUti.getNewAttName(pos, artifact)» = "ParameterError : «genUti.getNewAttName(pos, artifact)» is incorrect";
			«ENDFOR»
			public static String Param_emptyfilename = "ParameterError : Filename is empty";
			public static String Param_emptyfile = "ParameterError : File or filename not found";
			public static String Param_filenotfound = "ParameterError : File not found";
			public static String Param_corruptfile = "ParameterError : Corrupt file";

			public static String DB_notupdated = "DataBaseError : «name» not updated";
			public static String DB_notuploaded = "DataBaseError : «name» not uploaded";
«««			«FOR ref:refs»
«««				public static String DB_«ref.name»notfound = "DataBaseError : Problem recovering associated «ref.type.name»";
«««			«ENDFOR»

			public static String Search_empty = "Your search has no results. Try again";
			public static String «name»_notfound = "«name» not found. Try again later";
		}
	'''
}