import java.util.*;
public class LargestNoIn3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the three no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a>=b) && a>=c){
            System.out.println(a+" is the greater than the "+b+" & "+c);
        }else if(b>=c){
            System.out.println(b+" is the greater than "+a+" & "+c);
        }else{
            System.out.println(c+" is the greater than "+a+" & "+b);
        }
    }
    
}
