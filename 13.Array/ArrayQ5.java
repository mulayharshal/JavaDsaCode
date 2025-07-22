public class ArrayQ5 {
    public static int triplets(int num[]){
        int n=0;
        for (int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                for (int k=j+1;k<num.length;k++){
                    if((num[i]+num[j]+num[k]==0)){
                        System.out.print("["+num[i]+","+num[j]+","+num[k]+"], ");
                    }
                }
            }
        }
        return n;
    }

    public static void main (String [] args){
        int num[]={-1, 0, 1, 2, -1, -4};
        triplets(num);
    }
    
}
