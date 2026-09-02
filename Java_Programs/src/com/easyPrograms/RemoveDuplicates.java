package com.easyPrograms;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = { 0, 1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7 };

		int n = removeDuplicates(nums);
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	private static int removeDuplicates(int[] nums) {

		int writeIndex = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[writeIndex] = nums[i];
				writeIndex++;
			}
		}
		return writeIndex;
	}

}
