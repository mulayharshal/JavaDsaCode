import java.util.HashSet;

public class UnionAndIntersection {

    public static void main(String []a){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        // union
        HashSet<Integer> set=new HashSet<>();
        for(int n:arr1){
            set.add(n);
        }
        for(int n:arr2){
            set.add(n);
        }
        System.out.println("union  = "+set.size() +" no is "+set);

        // intersection
        int count=0;
        set.clear();
         for(int n:arr1){
            set.add(n);
        }
        System.out.print("intection no is : ");
        for(int n:arr2){
            if(set.contains(n)){
                count++;
                System.out.print(n+" ");
                set.remove(n);
                
            }
        }
        System.out.println(" and total intersection = "+count);

        
    }
    
}
