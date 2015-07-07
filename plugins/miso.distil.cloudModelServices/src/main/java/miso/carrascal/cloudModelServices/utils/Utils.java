package miso.carrascal.cloudModelServices.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * Custom utilities
 * 
 * @author Carlos Carrascal
 */
public class Utils {
   	
	/*
	 * Convert a string to list<String> using ',' and space as separators 
	 */
    public final static List<String> StringToListString(String str) {
    	if(str == null) {
			(new NullArgumentException()).printStackTrace();
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
    
	/*
	 * Convert a string to list<String> using ',' and space as separators (does not allow repeated)
	 */
    public final static List<String> tagsStringToList(String tags) {
	    List<String> tags_array = StringToListString(tags);
	    
	    // Eliminate duplicates
		HashSet<String> hs = new HashSet<String>(tags_array);
		tags_array.clear();
		tags_array.addAll(hs);
		
	    return tags_array;
    }
    
    /*
	 * Convert a string to list<int> using ',' and space as separators 
	 */
    public final static List<Integer> StringToListInteger(String str) {
    	List<Integer> list = new ArrayList<Integer>();
	    for(String token : StringToListString(str)) {
	    	list.add(Integer.parseInt(token));
	    }
	    return list;
    }
    
    /*
	 * Convert a string to list<double> using ',' and space as separators 
	 */
    public final static List<Double> StringToListDouble(String str) {
    	List<Double> list = new ArrayList<Double>();
	    for(String token : StringToListString(str)) {
	    	list.add(Double.parseDouble(token));
	    }
	    return list;
    }
    
    /*
	 * Convert a string to list<bool> using ',' and space as separators 
	 */
    public final static List<Boolean> StringToListBoolean(String str) {
    	List<Boolean> list = new ArrayList<Boolean>();
	    for(String token : StringToListString(str)) {
	    	list.add(Boolean.parseBoolean(token));
	    }
	    return list;
    }
    
    /*
	 * Convert a list to string using ',' as separator 
	 */
    public final static String ListToString(List<? extends Object> list) {
    	if(list == null) {
			(new NullArgumentException()).printStackTrace();
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
    
    /*
     * It parse some special characters to html characters (\n to <br>, space to nbsp, < to &#<, etc) 
     */
    public final static String escapeHTML(String s) {
    	if(s == null) {
			(new NullArgumentException()).printStackTrace();
    		s = "";
    	}
    	
        StringBuilder out = new StringBuilder(Math.max(16, s.length()));
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
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
