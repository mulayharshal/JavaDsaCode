import java.util.*;
//product the given two number using the function
public class FunProduct2Num {
    public static int product(int n1 ,int n2){  //create a function
        int product =n1*n2;
        System.out.println("Product is the : "+product);
        return product;//return

    }
    public static void main(String [] args){//main fuction
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the two number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        product(a, b);//call function
        product(3, 5);
    }
    
}
