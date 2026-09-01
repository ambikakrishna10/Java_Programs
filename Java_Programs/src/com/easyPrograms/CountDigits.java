package com.easyPrograms;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(countDigits(n));
	}

	public static int countDigits(int n) {
		if (n == 0) {
			return 1;
		}

		n = Math.abs(n);
		int count = 0;

		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
