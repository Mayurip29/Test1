package Testngtest.Testngtest;

import org.testng.SkipException;
import org.testng.annotations.Test;


public class Test2 {
	
	/*@Test(dependsOnMethods = {"test1"})
	 
	public void aSkipTest(){
		String condition ="Skip Test";
		if(condition.equals("Skip Test")){
		//throw new SkipException("Skipping - This is not ready for testing ");
		}else{
		System.out.println("I am in else condition");	
		}
		System.out.println("I am out of the if else condition");
	}
	
	@Test 
	public void nonSkipTest(){
		System.out.println("No need to skip this test");  */
	
	
	@Test(dependsOnMethods = {"testCase2"})
	public void testCase1(){
		System.out.println("Test Case 1");
	}
	
	
	@Test
	public void testCase2(){
		System.out.println("Test Case 2");
	}

		@Test(groups = {"FirstGroup"})
		public void testCase3(){
			System.out.println("Test Case 3");
		}
		@Test(groups = {"SecondGroup"})
		public void testCase4(){
			System.out.println("Test Case 4");
	}


}