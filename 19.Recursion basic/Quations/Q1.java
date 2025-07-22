package Quations;

public class Q1 {
    public static void main (String [] args ){
        int arr[]={3,2,4,5,6,2,7,2,2,};
        int key=2;
        findOcc(arr,key,0);
    }
    public static void findOcc(int arr[],int key ,int i){
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        if(i==arr.length-1){
            return;
        }
        findOcc(arr,key,i+1);
    }
}
