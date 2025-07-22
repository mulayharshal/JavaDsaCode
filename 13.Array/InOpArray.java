import java.util.*;
public class InOpArray {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int marks[] =new int[100];

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println(" marks of math= "+marks[0]+", phy= "+marks[1]+", chem = "+marks[2]);

        marks[1]=100;
        System.out.println(" marks of math= "+marks[0]+", phy= "+marks[1]+", chem = "+marks[2]);

        System.out.println("Length of array is "+marks.length);
    }
    
}
