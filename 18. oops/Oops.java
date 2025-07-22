public class Oops {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("blue");
        // // System.out.println(p1.color);
        // p1.setTip(5);
        // // System.out.println(p1.tip);

        // String color = p1.getColor();
        // int tip = p1.getTip();
        // System.out.println(color);
        // System.out.println(tip);

        // BankAccount myaccont = new BankAccount();
        // myaccont.username = "hm";
        // // myaccont.password="nj";
        // myaccont.setPassword("poep");


        //constructor
        Student s1=new Student();
        Student s2=new Student("harshal");
        System.out.println(s2.name);
        Student s3=new Student(21);
        System.out.println(s3.age);

        //cpoy constructor
        Student s4=new Student();
        s4.name="mulay";
        s4.age=20;
        s4.password="12232";
        s4.marks[0]=90;
        s4.marks[1]=80;
        s4.marks[2]=77;
        Student s5=new Student(s4);
        s5.password="xyz";
        s5.marks[2]=100;
        for(int mark : s5.marks){
            System.out.println(mark);
        }
    }
}

class Pen {
    private String color;
    private int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColor() {
        return this.color;

    }

    int getTip() {
        return this.tip;
    }
}

class BankAccount {
    public String username;
    private String password1;

    public   void setPassword(String password) {
        password1 = password;
    }

}

class Student {
    String name;
    int age;
    String password;
    int marks[];

    //non parameterized constructor
    Student() {
        marks=new int[3];
        System.out.println("this is cunstructor..........");
    }

    //parameterized custructor
    Student(String Name){
        marks=new int[3];
        this.name=Name;
    }
    Student(int Age){
        marks=new int[3];
        this.age=Age;
    }


    // // shallow copy constructor
    // Student (Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.age=s1.age;
    //     this.marks=s1.marks;
    // }

    // deep copy constructor
    Student (Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.age=s1.age;
        for(int i=0; i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
      
    }

    
}