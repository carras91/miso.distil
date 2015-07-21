package miso.carrascal.cloudModelServices.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.data.Word;
import net.sf.extjwnl.dictionary.Dictionary;

public class DictionaryUtils {
    
	public static List<String> getSynonymes(String word) {
    	List<String> synonyms = new ArrayList<String>();    	
    	if(word == null) {
			(new NullArgumentException()).printStackTrace();
			return synonyms;
    	}
    	synonyms.add(word.toLowerCase());
		
		Dictionary dictionary;
		try {
			dictionary = Dictionary.getDefaultResourceInstance();
		} catch (JWNLException e) {
			e.printStackTrace();
			return synonyms;
		}
       	
		try {
			for(POS pos : POS.getAllPOS()) {
				IndexWord indexWord = dictionary.getIndexWord(pos, word.toLowerCase());
				if(indexWord != null) {
					for(Synset sense : indexWord.getSenses()) {
						for(Word synonym : sense.getWords()){
							synonyms.add(synonym.getLemma().toLowerCase());
						}
					}
				}
			}
			HashSet<String> hs = new HashSet<String>();
			hs.addAll(synonyms);
			synonyms.clear();
			synonyms.addAll(hs);
			return synonyms;
        
		} catch (JWNLException e1) {
			e1.printStackTrace();
			return synonyms;
		}
    }
}
