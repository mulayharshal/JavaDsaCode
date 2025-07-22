public class pq {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for( int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tm=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tm;
                }
            }
        }
    }
    public static void selection(int arr[]){
        int n= arr.length;
        for(int  i=0; i<n;i++){
            int min=i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }
    public static void insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main (String [] args ){
        int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        insertion(arr);
        print(arr);
    }
    
}
