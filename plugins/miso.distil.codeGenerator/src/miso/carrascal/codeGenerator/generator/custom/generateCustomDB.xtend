package miso.carrascal.codeGenerator.generator.custom

import com.google.inject.Inject

class generateCustomDB {
	
	@Inject miso.carrascal.codeGenerator.generator.packages pack
		
	def write() '''
		package «pack.RootChar»;

		import java.io.InputStream;
		import java.util.ArrayList;
		import java.util.List;
		
		import «pack.MisoBasic».BasicInterfaceSpark;
		import «pack.MisoAbstract».AbstractPersistentClass;
		import «pack.MisoAbstract».InterfaceDB;

		public class CustomDB implements InterfaceDB, BasicInterfaceSpark 
		{
			@Override
			public void runService() {
				// To create your own DB implementation (implementing InterfaceDB)
				// CustomDB customDB = new CustomDB();

				// To create another MongoDB
				// String MONGO_URI = ""; // Valid mongo uri!! Example : mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?options]]
				// MongoDB mongoDB = new MongoDB(MONGO_URI);
		
				// To register them or set default one of them
				// Remember : all auto-generated code use the default DB
		    	// Integer positionDB = RecordDB.register(customDB); 	// (Use RecordDB.getDB(positionDB) to reach it)
		    	// RecordDB.setDefault(mongoDB);						// (Use RecordDB.getDefault() to reach it)
			}

			public CustomDB() {
				// Do something
			}

			@Override
			public Boolean save(AbstractPersistentClass artifact, InputStream inputStream) {
				return false;
			}

			@Override
			public Boolean delete(String id, Class<? extends AbstractPersistentClass> classType) {
				return false;
			}

			@Override
			public AbstractPersistentClass readOne(String id, Class<? extends AbstractPersistentClass> classType) {
				return null;
			}

			@Override
			public ArrayList<? extends AbstractPersistentClass> readAll(Class<? extends AbstractPersistentClass> classType) {
				return new ArrayList<AbstractPersistentClass>();
			}

			@Override
			public ArrayList<? extends AbstractPersistentClass> search(String attribute, Boolean synonymes_att, String value, Boolean synonymes_val, Class<? extends AbstractPersistentClass> classType) {
				return new ArrayList<AbstractPersistentClass>();
			}

			@Override
			public ArrayList<? extends AbstractPersistentClass> searchTag(String tag, Boolean synonymes, Class<? extends AbstractPersistentClass> classType) {
				return new ArrayList<AbstractPersistentClass>();
			}

			@Override
			public List<String> getSynonymes(String query) {
				return new ArrayList<String>();
			}

			@Override
			public InputStream getInputStream(String id, Class<? extends AbstractPersistentClass> classType) {
				return null;
			}

			@Override
			public long count() {
				return 0;
			}

			@Override
			public long count(Class<? extends AbstractPersistentClass> classType) {
				return 0;
			}

			@Override
			public int maxSaveSize() {
				return 0;
			}
		}
	'''
}