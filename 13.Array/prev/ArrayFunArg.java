public class ArrayFunArg {

    public static void update(int arr1[]){
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr1[i]+1;
        }
    }
    public static void main(String args[]){
        int arr1[]={10,20,30};
        update(arr1);

        for(int i=0;i<arr1.length;i++){
             System.out.println("Updated array: "+arr1[i]);
        }
       System.out.println();


    }

    
}
