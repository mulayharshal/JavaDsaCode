import java.util.*;
// addition of the two number using the function

public class FunAdd2Num {  

    public static int add(int a,int b){//create a function

        int add =a+b;//adition of given two number
        System.out.println("addition is the : "+add);//print the result
        return add;

    }
    public static void main(String args[] ){//main function
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter the numbers");

        int a =sc.nextInt();//give the input
        int b =sc.nextInt();//give the input
       add(a,b);//call the function

    }
    
}
