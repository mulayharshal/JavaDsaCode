package Quation;

import java.util.*;
public class realImaginary {
    public static void main (String [] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The First number real Part");
        int r1=sc.nextInt();
        System.out.println("Enter The First number imaginary Part");
        int i1=sc.nextInt();
        System.out.println("Enter The Second number real Part");
        int r2=sc.nextInt();
        System.out.println("Enter The Second number imaginary Part");
        int i2=sc.nextInt();
        System.out.println("Select what you want/n1)addition/n2)substracion/n3)multiplication/nEter the Option(1/2/3):");
        int options=sc.nextInt();
        switch(options){
            case 1:{
                addition(r1,r2,i1,i2);
                break;
            }
            case 2:{
                substracion(r1,r2,i1,i2);
            }
            case 3:{
                multiplication(r1,r2,i1,i2);
            }
            default:{
                System.out.println("You are entered Wrong");
            }
        }

       
    }

    static void addition(int r1 ,int r2, int i1, int i2){
        System.out.println("addition of "+r1+"+i"+i1+" and "+r2+"+i"+i2+" is = "+(r1+r2)+"+i"+(i1+i2));   
    }
    static void substracion(int r1 ,int r2, int i1, int i2){
        System.out.println("substracion of "+r1+"+i"+i1+" and "+r2+"+i"+i2+" is = "+(r1-r2)+"+i"+(i1-i2));   
    }
    static void multiplication(int r1 ,int r2, int i1, int i2){
        System.out.println("multiplication of "+r1+"+i"+i1+" and "+r2+"+i"+i2+" is = "+(r1*r2-i1*i2)+"+i"+(r1*i2+i1*r2));   
    }
    

    
}
