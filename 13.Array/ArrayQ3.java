public class ArrayQ3 {
    public static int stock(int prices[]){
        int profit=0;
        for (int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int sub=prices[j]-prices[i];
                if(sub>profit){
                    profit=sub;
                }
            }
            
        }
        return profit;

    }
    public static void main (String [] args){
        int prices[]={7, 1, 5, 3, 6, 4};
        System.out.println(stock(prices));
    }
    
}
