import java.util.*;

public class inbulit {
    public static void print(Integer arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main( String [] args){
        Integer arr[] = { 2,6,9,4,1,5};
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);

    }
    
}
