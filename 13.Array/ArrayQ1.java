import java.util.*;
public class ArrayQ1 {
    public static boolean twice(int num[]){

        boolean result=false;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    result=true;
                }

            }
        }
        return result;
    }
    public static void main(String []args){
        int num[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(twice(num));

    }
    
}
