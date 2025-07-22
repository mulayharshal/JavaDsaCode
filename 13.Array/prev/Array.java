import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc =new Scanner (System.in);

        int marks [] = new int [100];

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("first "+marks[0]+" second "+marks[1]+" third "+marks[2]);
        System.out.println("Length is the : "+marks.length);

    }
    
}
