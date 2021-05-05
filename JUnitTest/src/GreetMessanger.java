
public class GreetMessanger {
	private String greetings;

	GreetMessanger(String greet) {
		super();
		this.greetings = greet;
	}
	public String greeting()
	{
		System.out.println("Greetings :" + greetings);
		return greetings;
	}
}
