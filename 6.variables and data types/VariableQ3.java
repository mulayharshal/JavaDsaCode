import java.util.*;

//create bill of the 3 items
public class VariableQ3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the price of the pen , pencil ,eraser ");
        double pen = sc.nextDouble();
        double pencil = sc.nextDouble();
        double eraser = sc.nextDouble();
        
        double total = pen+pencil+eraser;
        double tax = 0.18*total;
        double bill = total+ tax;
        System.out.println("the bill with tax is the :"+bill);

    }
    
}
