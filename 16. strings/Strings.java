import java.util.*;
public class Strings{
    public static void main (String [] args){
        char arr[]={'a','b','c','d'};
        String str= "abcd";
        String str2=new String("xyz1234");

        //string length
        System.out.println(str2.length());

        //strings are immutable
        Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);

        //concatenation
        String firstName="Harshal";
        String lastName=" Mulay";
        System.out.println(firstName+lastName);
    }
}