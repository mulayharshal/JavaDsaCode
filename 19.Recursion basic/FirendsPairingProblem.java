public class FirendsPairingProblem {
    public static void main (String [] args){
        
        System.out.println(friendPairs(3));
    } 
    public static int friendPairs(int n){
        if(n==2 || n==1){
            return n;
        }
        
        return friendPairs(n-1)+(n-1)*friendPairs(n-2); 
    }
    
}
