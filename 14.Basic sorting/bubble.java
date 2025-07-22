public class bubble {
    public static void sort(int num[]){
        for(int i=0; i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]>num[j]){
                    int temp= num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
    }
    public static void print(int num[]) {
        for(int i=0; i<num.length;i++){
            System.out.print(num[i]);
        }
    }
    public static void main( String [] args){
        int num[]={4,7,2,9,5,8,3};
        sort(num);
        print(num);
    }
    
}
