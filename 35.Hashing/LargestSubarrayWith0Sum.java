import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    public static void main(String [] a){
        int arr[] ={15,-2,2,-8,1,7,10};

        HashMap<Integer, Integer> map=new HashMap<>();

        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                int j=map.get(sum);
                len=Math.max(len, i-j);
            }else{
                map.put(sum, i);
            }
        }
        System.out.println("largest sub arrays length is "+len);
        System.err.println(map);
    }
    
}
