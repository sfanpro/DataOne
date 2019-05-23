package ua.com.fan.taskone.first;

import org.junit.Assert;
import org.junit.Test;

public class ShiftArrayTest {

	@Test
	public void testInterviewArray1Test() {
		ShiftArray1 one = new ShiftArray1();
		int[] arr = { 6, 2, 5, 3 };
		int[] actual = one.interviewArrayTest(arr, 2);
		int[] expected = new int[] { 5, 3, 6, 2 };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testInterviewArray2Test() {
		ShiftArray2 one = new ShiftArray2();
		int[] arr = { 6, 2, 5, 3 };
		int[] actual = one.interviewArrayTest(arr, 2);
		int[] expected = new int[] { 5, 3, 6, 2 };
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testInterviewArray3Test() {
		ShiftArray3 one = new ShiftArray3();
		int[] arr = { 6, 2, 5, 3 };
		int[] actual = one.interviewArrayTest(arr, 2);
		int[] expected = new int[] { 5, 3, 6, 2 };
		Assert.assertArrayEquals(expected, actual);
	}

}
