package ua.com.fan.taskone.first;

import java.util.Arrays;
import java.util.Collections;

public class ShiftArray3 {

	public int[] interviewArrayTest(int[] array, int shift) {

		// modern convert int[] to Integer[]
		Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);

		// shift to the left with Collections.rotate
		Collections.rotate(Arrays.asList(integerArray), -shift);

		// convert back to int[]
		int[] intArray = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();

		return intArray;
	}

}
