package com.easyPrograms;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 6, 3, 8, 5, 9, 2 };
		System.out.print("Enter a target value: ");
		int target = sc.nextInt();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}

	}

}
