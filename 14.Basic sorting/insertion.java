public class insertion {
    public static void  sort(int arr[]){
        for (int i=1; i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void print(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
    public static void main(String[]args){
        int arr[]={5,9,3,6,2,8,1};
        sort(arr);
        print(arr);
    }
    
}
