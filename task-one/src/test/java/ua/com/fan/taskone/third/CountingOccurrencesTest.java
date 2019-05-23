package ua.com.fan.taskone.third;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CountingOccurrencesTest {

	@Test
	public void testGetIterviewMap1Test() {
		InterviewMap one = new InterviewMap();
		String[] array = { "this", "and", "that", "and" };
		Map<String, Integer> expected = new HashMap<>();
		expected.put("that", 1);
		expected.put("this", 1);
		expected.put("and", 2);

		Map<String, Integer> actual = one.getIterviewMap1(array);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testGetIterviewMap2Test() {
		InterviewMap one = new InterviewMap();
		String[] array = { "this", "and", "that", "and" };
		Map<String, Integer> expected = new HashMap<>();
		expected.put("and", 2);
		expected.put("that", 1);
		expected.put("this", 1);

		Map<String, Integer> actual = one.getIterviewMap1(array);
		Assert.assertEquals(expected, actual);
	}

}
