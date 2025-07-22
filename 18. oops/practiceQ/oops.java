package practiceQ;

public class oops{
    public static void main (String [] args){
        Student s =new Student();
        s.name = "John";
        System.out.println(s.marks);

    }
}

class Student{
    String name;
    int marks;
}