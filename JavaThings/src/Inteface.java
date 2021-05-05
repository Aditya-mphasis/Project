
public class Inteface {
  public static void main(String[] args) {
    Lion lion = new Lion();  // Create a Pig object
    lion.Roars();
  }
}

// Interface
interface Animal {
  public void Roars(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Lion "implements" the Animal interface
class Lion implements Animal {
  public void Roars() {
    // The body of animalSound() is provided here
    System.out.println("The Lion Roars");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Lion sleeps between 16-20hrs per day");
  }
}
