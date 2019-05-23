package ua.com.fan.taskone.first;

public class ShiftArray2 {

	public int[] interviewArrayTest(int[] array, int shift) {

		int[] array2 = new int[shift];
		for (int i = 0; i < array.length; i++) {
			if (i < shift) {
				array2[i] = array[i];
				continue;
			}
			array[i - shift] = array[i];
		}

		System.arraycopy(array2, 0, array, array.length - shift, shift);

		return array;
	}
}
