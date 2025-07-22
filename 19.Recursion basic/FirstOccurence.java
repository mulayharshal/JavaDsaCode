public class FirstOccurence {
    public static void main (String [] args ){
        int arr []= {8, 3 ,6,9,5,10,2,5,3 };
        System.out.println(fiOcc(arr,4 ,0));
    }
    public static int fiOcc(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return fiOcc(arr,key,++i);

    }
    
}
