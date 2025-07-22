public class selection {
    public static void sort(int num[]){
        
        for(int i=0;i<num.length-1;i++){
            int small=i;
            for(int j=i+1;j<num.length;j++){
                if(num[j]<num[small]){
                    small=j;
                }
            }
            int temp=num[small];
            num[small]=num[i];
            num[i]=temp;
        }

    }
    public static void print(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
    }
    public static void main(String [] args){
        int num[] = {5,4,1,3,2};
        sort(num);
        print(num);
    }
    
}
