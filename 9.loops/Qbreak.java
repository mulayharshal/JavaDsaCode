import java.util.*;
//give the number upto user not enter the number in multiple of 10
public class Qbreak {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);

        do{
            System.out.print("Enter your number :");
            int a= sc.nextInt();
            if (a%10==0){
                break;
            }
            System.out.println(a);
        }while(true);

    }
    
}
