package com.techniques;

import java.util.HashSet;

/*
 * Given an array a that contains only numbers in the range from 1 to a.length, 
 * find the first duplicate number for which the second occurrence has the minimal index. 
 * In other words, if there are more than 1 duplicated numbers, 
 * return the number for which the second occurrence has a smaller index than 
 * the second occurrence of the other number does. 
 * If there are no such elements, return -1.
 * 
 * 
 */


public class FirstDuplicate {
	public static int firstDuplicate(int[] a){
		if(a == null || a.length == 0)
			return -1;
		HashSet<Integer> map = new HashSet<Integer>();
		for (int index = 0; index < a.length; index++){
			if(map.contains(a[index])){
				return a[index];
			}else{
				map.add(a[index]);
			}
		}
		return -1;
	}
}
