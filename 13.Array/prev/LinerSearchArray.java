import java.util.*;
public class LinerSearchArray {
    public static int linerSearch(int numbers[],int key){
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }  
        }
        return -1;
        
    }

    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        int numbers [] ={2,4,6,8,10,12,14};
        int key =sc.nextInt();
        int index =linerSearch(numbers,key);
        if(index== -1){
            System.out.println("num is not found ");
        }else{
            System.out.println(key+" is "+index+" index");
        }
    }
    
}
