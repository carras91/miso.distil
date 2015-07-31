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

/**
 * Dictionary utils. It finds a word synonyms using WordNet database.
 *
 * @author Carlos Carrascal.
 */
public class DictionaryUtils {
    
	/**
	 * Find a word synonyms inside WordNet database.
	 * 
	 * @param word String to be found.
	 * @return List(String) with the synonyms. Empty if NullPointerException().
	 */
	public static List<String> getSynonyms(String word) {
    	List<String> synonyms = new ArrayList<String>();    	
    	if(word == null) {
			(new NullPointerException()).printStackTrace();
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
