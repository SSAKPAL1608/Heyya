package Generic_method;

import org.testng.annotations.Test;

import practice.BaseClass;

public class TestDependencyExample {
	
	

	@Test(dependsOnMethods = "prerequisiteTest1")
	public void testCaseA() {
		// This is the main test case A
		System.out.println("Executing testCaseA");
	}

	@Test(dependsOnMethods = "prerequisiteTest2")
	public void testCaseB() {
		// This is another test case B
		System.out.println("Executing testCaseB");
	}

	@Test
	public void prerequisiteTest2() {
		// This is another prerequisite test case
		System.out.println("Executing prerequisiteTest2");
	}

	@Test
	public void prerequisiteTest1() {
		// This is a prerequisite test case
		System.out.println("Executing prerequisiteTest1");
	}

}