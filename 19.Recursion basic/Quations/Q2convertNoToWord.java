package Quations;

public class Q2convertNoToWord {
    public static void main (String [] args){
        convert(1947);

    }
    public static void convert(int num){
        String arr[]={"zero", "one","two","three", "four", "five","six","seven","eight","nine"};
        if(num==0)
            return;
        int n=num%10;
        convert(num/10);
        System.out.print(arr[n]+" ");
    }
    
}
