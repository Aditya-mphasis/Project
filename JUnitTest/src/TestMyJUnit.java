import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/*import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;	*/

//import org.junit.Test;

public class TestMyJUnit {
 @Test
 public void testWelcome(){
    // String welcomeMessage="Welcome to JUnit";
    GreetMessanger greetMsg=new GreetMessanger("Welcome to JUnit");
     assertEquals("Welcome to JUnit",greetMsg.greeting());
 }
 @Test
 public void testWelcome1(){
     String welcomeMessage="Welcome to JUnit";
     assertEquals("Welcome to JUnit",welcomeMessage);
 }
 
@Test
 public void testWithdraw() {
    SavingsAccount savObj = new SavingsAccount(85000);
    savObj.withdraw(15000);
    assertNotNull(savObj);
    //assertEquals(70000,savObj.getBankBalance());
 }


@Test
 public void testSomeAssertions(){
        int empno= 7777;
        String empname="MS DHONI";
        String empjob="CAPTAIN";
       
     assertEquals("CAPTAIN",empjob);
     System.out.println("empjob  passed");
     assertTrue(empno>1000);
     System.out.println("empno  passed");
     assertNotNull(empname);
     System.out.println("empname  passed");
     System.out.println("testSomeAssertions is over...");
     }
}