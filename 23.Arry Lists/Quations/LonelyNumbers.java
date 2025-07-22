package Quations;

import java.util.ArrayList;
import java.util.Arrays;

public class LonelyNumbers {
    public static void main(String [] args){
        ArrayList<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(10,6,5,8));
        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.addAll(Arrays.asList(1,3,5,3));
        findLonelyNo(nums);
        findLonelyNo(nums1);

    }
    public static void findLonelyNo(ArrayList<Integer> nums){
        ArrayList<Integer> lonely=new ArrayList<>();
        for(int i=0;i<nums.size();i++){

            int ge=nums.get(i)+1;
            int sm=nums.get(i)-1;
            //left
            if(i<nums.size()-1){
                if(ge==nums.get(i+1) || sm==nums.get(i+1) ){
                    continue;
                }
            }
           //right
            if(i>0){
                if(ge==nums.get(i-1) || sm==nums.get(i-1) ){
                continue;
                }
            }
            //similar
            if(noIsHave(nums, nums.get(i), i)){
                continue;
            }
            
            lonely.add(nums.get(i));
        }
        System.out.println(lonely);
    }
    public static boolean noIsHave(ArrayList<Integer> nums,int n,int idx){
        for(int i=0; i<nums.size();i++){
            if(nums.get(i)==n && i!=idx){
                return true;
            }
        }
        return false;
    }
    
}
