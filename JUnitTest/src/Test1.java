/*import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Test1 {
	@Test
	public void testWelcome()
	{
		GreetMessanger greetmsg = new GreetMessanger("Welcome to JUnit");
		assertEquals("Welcome to JUnit", greetmsg.greeting());
	}
	
	@Test
	public void testSomeAssertions()
	{
		int empno = 777;
		String empname = "Mahi";
		String empJob = "Captain";
		
		assertEquals("Captain", empJob);
		System.out.println("Empjob is passed");
		
		assertTrue(empno > 500);
		System.out.println("Emp Passed");
		
		assertNotNull(empname);
		System.out.println("Emp Name passed");
		
		System.out.println("Testsome Assertions over");
	}
	
	@Test
	public void testBank()
	{
		SavingsAccount sa = new SavingsAccount(5000);
		
		assertNotNull(sa);
		sa.withdraw(2000);
		
		assertEquals(3000, sa.getBankBalance(), "Balance is not Matching");
	}
}
*/