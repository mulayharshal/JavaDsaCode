public class PairsInArray {
    public static void main(String []args){
        int numbers[]={2,4,6,8,10};

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.println("("+numbers[i]+","+numbers[j]+")");
            }
        }
    }
}
