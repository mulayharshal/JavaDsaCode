import java.util.*;
public class TernaryOperator{
    //Odd Even Using the Ternaty Operater
    public static void main (String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no ");
        int n = sc.nextInt();

        String result = (n%2==0)?"EVEN":"ODD";
        System.out.println(result);
    }
}