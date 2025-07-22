public class polymorphisam {
    public static void main(String[] args) {
        Claculator clc=new Claculator();
        System.out.println(clc.sum(10,20 ));
        System.out.println(clc.sum(10,20 ,30));
        System.out.println(clc.sum(10.32f,20.4f ));

        Deer d=new Deer();
        d.eat();
    }
    
}

//function  overloading
class Claculator{
    int sum( int a, int b){
        return a+b;
    }
    float sum( float a, float b){
        return a+b;
    }
    int sum( int a, int b,int c){
        return a+b+c;
    }
}


//overridings
class Animal{
    void eat(){
        System.out.println("eats anythings");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}