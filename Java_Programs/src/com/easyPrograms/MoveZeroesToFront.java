package com.easyPrograms;

import java.util.Arrays;

public class MoveZeroesToFront {

	public static void main(String[] args) {
		int[] arr = {4,0,1,0,6,0,0,5,3,0,8,2};
		
		int writeIndex = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				int temp = arr[writeIndex];
				arr[writeIndex] = arr[i];
				arr[i] = temp;
				writeIndex++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
