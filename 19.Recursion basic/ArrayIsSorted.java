public class ArrayIsSorted {
    public static void main ( String args [] ){
        int arr[]={1,2,3,4,9};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int arr[] , int i){
        if(arr[i]>arr[i+1]){
            return false;
        }
        if(i==arr.length-2){
            return true;
        }
        return isSorted(arr ,i+1);
    }
    
}
