package ua.com.fan.taskone.first;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 6, 2, 5, 3 };

		ShiftArray1 one = new ShiftArray1();
		ShiftArray2 two = new ShiftArray2();

		print(one.interviewArrayTest(arr, 2));

		System.out.println("\n-------------");

		// simple print
		System.out.println(Arrays.toString(one.interviewArrayTest(arr, 2)));

		System.out.println("===============");

		print(two.interviewArrayTest(arr, 2));

	}

	public static void print(int[] intArray) {
		for (int i = 0; i < intArray.length; ++i) {
			System.out.print(intArray[i] + " ");
		}
	}
}
