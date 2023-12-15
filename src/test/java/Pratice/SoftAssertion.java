package Pratice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void m1()
	{
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(false, true);
		System.out.println("step4");
		System.out.println("step5");
		soft.assertAll();
		System.out.println("step6");
		System.out.println("step7");
	}
	/*@Test
	public void m2()
	{
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		Assert.assertEquals(true, true);
	}*/
}
