package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@Login")
	public void beforescenario()
	{
		System.out.println("Load Login page");
	}
	
	@Before("@Signup")
	public void beforescenario2()
	{
		System.out.println("Load Signup page");
	}
	@After
	public void afterscenario()
	{
		System.out.println("Close browser");
	}

}
