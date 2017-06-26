package com.techniques;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstDuplicateTest {

	@Test
	public void intShouldBeMinus1AtTheEnd() {
		int result;
		result = FirstDuplicate.firstDuplicate(new int[] {2, 4, 3, 5, 1});
		result = FirstDuplicate.firstDuplicate(new int[] {1});
		result = FirstDuplicate.firstDuplicate(new int[] {2, 1});
		result = FirstDuplicate.firstDuplicate(new int[] {2, 1, 3});
		result = FirstDuplicate.firstDuplicate(new int[] {10, 6, 8, 4, 9, 1, 7, 2, 5, 3});
		assertEquals(-1, result);
	}
	
	@Test
	public void intShouldBePositiveNumber(){
		boolean expectedResult = true;
		if(FirstDuplicate.firstDuplicate(new int[] {2, 3, 3, 1, 5, 2}) != 3){
			expectedResult = false;
		}
		if(FirstDuplicate.firstDuplicate(new int[] {2, 2}) != 2){
			expectedResult = false;
		}
		if(FirstDuplicate.firstDuplicate(new int[] {2, 3, 3}) != 3){
			expectedResult = false;
		}
		if(FirstDuplicate.firstDuplicate(new int[] {3, 3, 3}) != 3){
			expectedResult = false;
		}
		if(FirstDuplicate.firstDuplicate(new int[] {8, 4, 6, 2, 6, 4, 7, 9, 5, 8}) != 6){
			expectedResult = false;
		}
		
		assertEquals(true, expectedResult);
	}

}
