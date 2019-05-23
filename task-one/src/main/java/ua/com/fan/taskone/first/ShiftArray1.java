package ua.com.fan.taskone.first;

public class ShiftArray1 {

	// method returning an array shifted to the left
	public int[] interviewArrayTest(int[] array, int shift) {

		// array initialization outside of loop for array return value
		int[] result = new int[array.length];
		int startFrom = 0;
		for (int i = 0; i < array.length; ++i) {
			if (shift + i < array.length) {
				result[i] = array[shift + i];
			} else {
				result[i] = array[startFrom];
				++startFrom;
			}
		}
		return result;
	}
}
