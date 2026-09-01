package com.easyPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void fibonacci(int n) {
		if (n <= 0) {
			return;
		}

		long first = 0;
		long second = 1;
		
		for (int i = 0; i <= n; i++) {
			System.out.print(first + " ");
			long next = first + second;
			first = second;
			second = next;
		}
		System.out.println();
	}

	void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		fibonacci(n);
	}
}
