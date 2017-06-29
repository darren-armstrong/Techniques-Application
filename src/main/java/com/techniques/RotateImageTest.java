package com.techniques;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateImageTest {

	@Test
	public void expectedOutputOne() {
		int[][] twoDArray = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int[][] expectedOutcome = new int[][]{{7,4,1},{8,5,2},{9,6,3}};
		assertArrayEquals(expectedOutcome, RotateImage.rotateImage(twoDArray));
	}

	@Test
	public void expectedOutputTwo() {
		int[][] twoDArray = new int[][]{{33,35,8,24,19,1,3,1,4,5},
			{25,27,40,25,17,35,20,3,19,3},
			{9,1,9,30,9,25,32,12,15,22},
			{30,47,25,10,18,1,19,17,43,17},
			{40,46,42,34,18,48,29,40,31,39},
			{37,42,37,19,45,1,4,46,48,13},
			{8,26,31,46,44,24,34,29,12,25},
			{45,48,36,12,33,12,4,45,22,37},		 
			{33,15,34,25,34,8,50,48,30,28}, 
			{18,19,22,29,15,43,38,30,8,47}};
		int[][] expectedOutcome = new int[][]{{18,33,45,8,37,40,30,9,25,33},
			{19,15,48,26,42,46,47,1,27,35}, 
			{22,34,36,31,37,42,25,9,40,8}, 
			{29,25,12,46,19,34,10,30,25,24}, 
			{15,34,33,44,45,18,18,9,17,19}, 
			{43,8,12,24,1,48,1,25,35,1}, 
			{38,50,4,34,4,29,19,32,20,3}, 
			{30,48,45,29,46,40,17,12,3,1}, 
			{8,30,22,12,48,31,43,15,19,4}, 
			{47,28,37,25,13,39,17,22,3,5}};
		assertArrayEquals(expectedOutcome, RotateImage.rotateImage(twoDArray));
	}
}
