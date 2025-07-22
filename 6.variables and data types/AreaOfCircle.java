import java.util.*;

// Claculate the area of the circle
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ehter the radius of circle ");
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("The area of circle is :"+area);
    }

    
}