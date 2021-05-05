class Bike extends Thread { 
   public void  run() { System.out.println("Bike"); }
}
class Car extends Thread { 
   public void  run() { System.out.println("Car"); }
}
class Abstract { public static void main(String args[]) 
   {
        Car c = new Car();
        Bike b = new Bike();
        
        c.start();
        b.start();
   } 
}