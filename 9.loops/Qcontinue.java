import java.util.*;
//give the number from user print given all no except in multiple of 10
public class Qcontinue {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the number : ");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
        System.out.println("number is the : "+n);

        }while(true);

    }
    
}
