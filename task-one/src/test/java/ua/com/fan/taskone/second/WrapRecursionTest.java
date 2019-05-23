package ua.com.fan.taskone.second;

import org.junit.Assert;
import org.junit.Test;

public class WrapRecursionTest {

	@Test
	public void testVowelsWrapper() {
		WrapRecursion wrapper = new WrapRecursion();
		String str = "wrappee any vowels here in any group of words";
		String actual = wrapper.vowelsWrapper(str);
		String expected = new String("wr*a*pp*e*e a*ny v*o*w*e*ls h*e*r*e i*n a*ny gr*o*u*p o*f w*o*rds");
		Assert.assertEquals(expected, actual);
	}

}
