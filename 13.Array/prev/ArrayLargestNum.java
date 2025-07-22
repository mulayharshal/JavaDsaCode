public class ArrayLargestNum {
    public static int getlarge(int num[]){
        int n= Integer.MIN_VALUE;
        int no=90;

        for(int i=0;i<num.length;i++){
            if(num[i]>n){
                n=num[i];
            }
        }return n;
        
    }
    public static void main(String [] args){
        int num[]={1,2,6,3,5,9};
        System.out.println(getlarge(num));
        

    }
    
}
