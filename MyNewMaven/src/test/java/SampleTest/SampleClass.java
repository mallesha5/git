package SampleTest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SampleClass {
 
	@Test
	public void Sample()
	{
		System.out.println("This is a sample program");
	}

	@Test
	public void Sample1()
	{
		System.out.println("This is a sample program1");
		assertTrue(true);
	}
	
	@Test
	public void Sample2()
	{
		System.out.println("This is a sample program2");
		assertTrue(true);
	}
	

}
