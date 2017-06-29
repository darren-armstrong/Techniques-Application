package com.techniques;

public class RotateImage {
	static int[][] rotateImage(int[][] a) {
	    int[][] rotatedArray = new int[a.length][a.length];
	    for(int i = 0; i < a.length; ++i){
	        for (int j = 0; j < a.length; ++j){
	            rotatedArray[i][j] = a[a.length - j - 1][i];
	        }
	    }
	    return rotatedArray;
	}

}
