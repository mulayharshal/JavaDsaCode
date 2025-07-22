public class abstraction {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.eat();
        h.walk();
        // h.changeColor();
        System.out.println(h.color);

        // Chiken c= new Chiken();
        // c.eat();
        // c.walk();

        // Animal a= new Animal();
        
    }
    
}
abstract class Animal {
    String color;
    Animal(){
        System.out.println("animal constructor called");
        this.color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();

    
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walkes on 4 legs");
    }
}

class Chiken extends Animal{
    Chiken(){
        System.out.println("Chiken constructor called");
        }
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("wlaks on 2 lages");
    }
}