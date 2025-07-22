public class inheritance {
    public static void main(String [] args){

        //sinle level
        Fish shark=new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();

    //multi level
        Dog dobby=new Dog();
        dobby.walk();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}

class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("walking..");
    }
}
class Dog extends Mammal{
    String  breed;
}