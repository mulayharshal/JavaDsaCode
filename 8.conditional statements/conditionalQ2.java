import java.util.*;
// prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fYever
public class conditionalQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature");
        double temp = sc.nextDouble();

        if(temp>=100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You don't have a fYever");
        }
        
    }
    
}
