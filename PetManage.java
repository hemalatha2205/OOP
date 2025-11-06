package co2_scena;

//Base class
class Anima {
 void eat() {
     System.out.println("The animal eats food.");
 }
}

//Derived class
class Dog extends Anima {
 void bark() {
     System.out.println("The dog barks.");
 }
}

//Further derived class
class Puppy extends Dog {
 void weep() {
     System.out.println("The puppy weeps softly.");
 }
}

public class PetManage {
 public static void main(String[] args) {
     Puppy p = new Puppy();
     p.eat();   // from Animal
     p.bark();  // from Dog
     p.weep();  // from Puppy
 }
}
