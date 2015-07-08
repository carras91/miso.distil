package miso.carrascal.codeGenerator.generator.basic

import com.google.inject.Inject
import codeGeneratorModel.Artifact
import org.eclipse.emf.common.util.EList
import codeGeneratorModel.Attribute

/*
 * To write BasicXXXCodes.java
 * 
 * @author Carlos Carrascal
 */
class generateBasicCodes { 
	
	@Inject miso.carrascal.codeGenerator.generator.generateUtils genUti
	@Inject miso.carrascal.codeGenerator.generator.packages pack
	
	/*
	 * To write Basic<artifact.name>Codes.java
	 * 
	 * @author Carlos Carrascal
	 */
	def write(Artifact artifact) '''
		«val name = artifact.name»
		«val EList<Attribute> allAtts = genUti.getAllNestedAttributes(artifact.attributes)»
		«var pos = -1»
		package «pack.getBasicChar(artifact)»;

		import «pack.MisoBasic».BasicAbstractCodes;

		/**
		 * Auto-generated error codes
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class Basic«name»Codes extends BasicAbstractCodes {

			public static String Param_error = "ParameterError : Parameter is incorrect";

			// Parameters errors
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

			public static String Search_empty = "Your search has no results. Try again";
			public static String «name»_notfound = "«name» not found. Try again later";
		}
	'''
}