import java.util.*;
public class compression {
    public static void compress(String str){

        String newStr="";
        
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if (count>1){
                newStr+=count;
            }
        }

        System.out.println(newStr);
    }
    public static void main(String [] args){
        String str ="aaabbcccdd";

        compress(str);
    }
    
}
