package com.easyPrograms;

import java.util.Arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
		int writeIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[writeIndex];
				arr[writeIndex] = arr[i];
				arr[i] = temp;
				writeIndex++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
