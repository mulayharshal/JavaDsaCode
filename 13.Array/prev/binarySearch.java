public class binarySearch{
    public static int binarySearch1(int num[],int key){
        int start =0,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if (num[mid]==key){
                return mid;

            }else if(num[mid] <key){
                start= mid+1;
            }else if(num[mid]>key){
                end =end-1;
            }
            
        }
        return -1;
    }

    public static void main(String args[]){
        int num []={1,2,3,4,5,6,7,8,9,0};
        int key =8;
        int index=binarySearch1(num,key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("No is found on the index : "+index);
        }
    }

}