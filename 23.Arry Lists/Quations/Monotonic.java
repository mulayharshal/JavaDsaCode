package Quations;

import java.util.ArrayList;
import java.util.Arrays;

public class Monotonic {
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(6,5,4,4));
        System.out.println(isMonotonic(list));
    }
    public static boolean isMonotonic(ArrayList<Integer> list){
        if(list.get(0)<list.get(1)){
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)){
                    return false;
                }
            }
        }else{
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)<list.get(i+1)){
                    return false;
                }
            }
        }
        return true;
        
    }
    
}
