import java.util.*;
public class BinarySearch {
    public static void BiSearch(int numbers[],int key){
        int start=0;
        int end=numbers.length;

        int mid=(start+end)/2;
        for (int i=start;i<end;i++){
            if((int)numbers[i]==key){
                System.out.println(key+" is found on the index "+i);
            }
            else if(mid<key){
                start=mid+1;
            }
            else if(mid>key){
                end=mid-1;
            }
            else{
                System.out.println("number is not found  ");

            }
        }
    }
    public static void main(String [] args){
        int numbers[]={2,4,6,8,10,12,14};
        int key=12;
        BiSearch(numbers, key);

    }
    
}
