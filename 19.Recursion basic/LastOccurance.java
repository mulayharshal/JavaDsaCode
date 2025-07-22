public class LastOccurance {
    public static void main (String [] args){
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(laOcc(arr ,5,arr.length-1));

    }
    public static int laOcc(int arr[], int key, int i){
        if(arr[i]==key){
            return i;
        }
        if(i==0){
            return -1;
        }
        return laOcc(arr,key,i-1);
    }
}
