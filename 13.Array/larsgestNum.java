import java.util.*;

public class larsgestNum {
    public static int getLargest(int numbers[] ){
        int largest=Integer.MIN_VALUE;

        for (int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
                
            }
         
        }
        return largest;

    }

    public static int getSmallest(int numbers[] ){
        int smallest=Integer.MAX_VALUE;

        for (int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
                
            }
         
        }
        return smallest;

    }
    public static void main(String [] args){
        int numbers[]={1,2,6,3,5,9,0};
        int n=getLargest(numbers);
        int n2=getSmallest(numbers);
        System.out.println("largest number is the "+n);
        System.out.println("Smallest number is the "+n2);


    }
    
}
