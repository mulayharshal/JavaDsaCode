package Quations;

public class KeypadCombination {
    public static void main(String [] args){
        keypad("2",0);
    }
    public static void keypad(String dig,int i){
        //base case
        if(i>dig.length()){
            return;
        }

        //recursion
        int n=(int)dig.charAt(i);
        combination(n,new StringBuilder());
        keypad(dig, i+1);

    }
    public static void combination(int n,StringBuilder str){
        char chars[][]={{},{},{'a','b','c'},{'d','e','f'},
                        {'g','h','i'},{'j','k','l'},{'m','n','o'},
                        {'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

        
    }

    
}
