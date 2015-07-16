package miso.distil.codeGenerator.generator.entities

import com.google.inject.Inject
import codeGeneratorModel.Root

/*
 * To write CustomDb.java
 * 
 * @author Carlos Carrascal
 */
class generateMongoDataBase {
	
	@Inject miso.distil.codeGenerator.generator.Names names
	
	/*
	 * To write CustomDb.java
	 * 
	 * @author Carlos Carrascal
	 */
	def write(Root root) '''
		package «names.RootChar»;
		
		import «names.MisoBasic».BasicInterfaceSpark;
		import «names.Miso».MongoDB;
		import «names.MisoAbstract».RecordDB;
		
		/**
		 * Auto-generated data base class
		 * 
		 * @author miso.distil.codeGenerator
		 */
		public class MongoDataBase implements BasicInterfaceSpark 
		{
			«var pos = 0»
			«FOR uri : root.mongoURIs»
				private final static String MONGO_URI_«pos» = "«uri»";
				«{pos++; null}»
			«ENDFOR»

			/**
			 * Auto-generated spark service to find and activate some Mongo DataBases
			 * 
			 * @author miso.distil.codeGenerator
			 */
			@Override
			public void runService() {
				// To create your own DB implementation you need to create a class implementing InterfaceDB
				// CustomDB customDB = new CustomDB();

				// To register them or set default one of them
				// Remember : all auto-generated code use the default DB
				// Integer positionDB = RecordDB.register(customDB); 	// (Use RecordDB.getDB(positionDB) to reach it)
				// RecordDB.setDefault(customDB);						// (Use RecordDB.getDefault() to reach it)

				«{pos=0; null}»
				«FOR uri : root.mongoURIs»
					try {
						MongoDB mongoDB_«pos» = new MongoDB(MONGO_URI_«pos»);
						Integer positionDB_«pos» = RecordDB.register(mongoDB_«pos»);
						System.out.println("mongoDB_«pos» registered in position " + positionDB_«pos»);
						«IF pos == 0»
							RecordDB.setDefault(mongoDB_«pos»);
							System.out.println("mongoDB_«pos» set default");
						«ENDIF»
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("mongoDB_«pos» has found an exception");
					}
					«{pos++; null}»

				«ENDFOR»
			}
		}
	'''
}