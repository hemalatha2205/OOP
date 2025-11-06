package co2_scena;

//Parent class
class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Child class (inherits from Animal)
class Lion extends Animal {
 void roar() {
     System.out.println("The lion roars loudly!");
 }
}

//Main class
public class ZooApp {
 public static void main(String[] args) {
     Lion lion = new Lion();
     lion.eat();   // Inherited method
     lion.roar();  // Lion-specific method
 }
}
