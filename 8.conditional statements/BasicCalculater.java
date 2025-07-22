import java.util.*;
// Basic Calculater using Switch
public class BasicCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the one operation Number which you want to calculate ");
        System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Division");
        int operation =sc.nextInt();
        System.out.println("Enter the First Number");
        double a =sc.nextDouble();
        System.out.println("Enter the Second Number ");
        double b = sc.nextDouble();

        switch (operation) {

            case 1:System.out.println("Addition is : "+(a+b));
                break;
            case 2:System.out.println("Substraction is : "+(a-b));
                break;
            case 3:System.out.println("Multiplication is : "+(a*b));
                break;
            case 4:System.out.println("Divison is : "+(a/b));
        
            default:System.out.println("please enter the valied operation no");
                break;
        }
    }
    
}
