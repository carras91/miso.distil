package miso.carrascal.cloudModelServices.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Custom utilities. To transform List(Object) to String and String to List(Object).
 * 
 * @author Carlos Carrascal.
 */
public class Utils {
   	
    /**
     * Convert a String to List(String) using ',' and space as separators.
     * 
     * @param str String to convert.
     * @return new List(String) with separated elements. Empty if NullPointerException().
     */
    public static List<String> stringToListString(String str) {
    	if(str == null) {
			(new NullPointerException()).printStackTrace();
			str = "";
		}

    	String[] tags_split;
    	tags_split = str.split("[ ,]+");
    	
	    List<String> tags_array = new ArrayList<String>();
	    for(String tag : tags_split) {
	    	if(!tag.isEmpty()) {
	    		tags_array.add(tag);
	    	}
	    }
		
	    return tags_array;
    }
    
    /**
     * Convert a String to List(String) using ',' and space as separators (does not allow repeated elements).
     * 
     * @param str String to convert.
     * @return new List(String) with separated elements. Empty if NullPointerException().
     */
    public static List<String> singleStringToListString(String str) {
	    List<String> array = stringToListString(str);
	    
	    // Eliminate duplicates
		HashSet<String> hs = new HashSet<String>(array);
		array.clear();
		array.addAll(hs);
		
	    return array;
    }
    
    /**
     * Convert a String to List(Integer) using ',' and space as separators.
     * 
     * @param str String to convert.
     * @return new List(Integer) with separated elements. Empty if NullPointerException().
     */
    public static List<Integer> stringToListInteger(String str) {
    	List<Integer> list = new ArrayList<Integer>();
	    for(String token : stringToListString(str)) {
	    	list.add(Integer.parseInt(token));
	    }
	    return list;
    }
    
    /**
     * Convert a String to List(Double) using ',' and space as separators.
     * 
     * @param str String to convert.
     * @return new List(Double) with separated elements. Empty if NullPointerException().
     */
    public static List<Double> stringToListDouble(String str) {
    	List<Double> list = new ArrayList<Double>();
	    for(String token : stringToListString(str)) {
	    	list.add(Double.parseDouble(token));
	    }
	    return list;
    }
    
    /**
     * Convert a String to List(Boolean) using ',' and space as separators.
     * 
     * @param str String to convert.
     * @return new List(Boolean) with separated elements. Empty if NullPointerException().
     */
    public static List<Boolean> stringToListBoolean(String str) {
    	List<Boolean> list = new ArrayList<Boolean>();
	    for(String token : stringToListString(str)) {
	    	list.add(Boolean.parseBoolean(token));
	    }
	    return list;
    }
    
    /**
     * Convert a List(Object) to String using ', ' as separator.
     * 
     * @param list list of objects to concatenate.
     * @return new String with the list elements separated by ", " (except the last one). Empty if NullPointerException().
     */
    public static String listToString(List<? extends Object> list) {
    	if(list == null) {
			(new NullPointerException()).printStackTrace();
			list = new ArrayList<Object>();
    	}
    	
		String str = "";
		
		Iterator<? extends Object> iterator = list.iterator();
		if(iterator.hasNext()) {
			str += iterator.next().toString();
		}
		while(iterator.hasNext()) {
			str += "," + iterator.next().toString();
		}
		return str;
    }
    
    /**
     * It parse some special characters to html characters.
     *  - \n, space, chars over 127, ", more than, less than, ampersand.
     * 
     * @param str String with HTML code to modify.
     * @return String with HTML escaped. Empty if NullPointerException().
     */
    public static String escapeHTML(String str) {
    	if(str == null) {
			(new NullPointerException()).printStackTrace();
			str = "";
    	}
    	
        StringBuilder out = new StringBuilder(Math.max(16, str.length()));
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '\n') {
            	out.append("<br>");
            } else if(c == ' ') {
            	out.append("&nbsp&nbsp");
            } else if (c > 127 || c == '"' || c == '<' || c == '>' || c == '&') {
                out.append("&#");
                out.append((int) c);
                out.append(';');
            } else {
                out.append(c);
            }
        }
        return out.toString();
    }
}
