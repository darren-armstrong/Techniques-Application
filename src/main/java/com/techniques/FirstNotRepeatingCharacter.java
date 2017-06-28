package com.techniques;

import java.util.*;

public class FirstNotRepeatingCharacter {

	static char firstNotRepeatingCharacter(String s) {
	    List<Character> map = new ArrayList<Character>();
	    HashSet<Character> uniqueMap = new HashSet<Character>();  
	    for(char l : s.toCharArray()){
	        map.add(l);
	        uniqueMap.add(l);
	    }
	    for(char l : uniqueMap){
	        if(Collections.frequency(map, l) == 1)
	            return l;
	    }
	    return '_';
	}
	
}
