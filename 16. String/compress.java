public class compress {
    public static void compress(String str ){
        String newS="";

        for (int i=0; i<str.length();i++){
            Integer coun=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                coun++;
                i++;

            }
            newS+=str.charAt(i);
            if(coun>1){
                newS+=coun;
            }
        }
        System.out.println(newS);
    }
    public static void main (String [] args){
        String str = "aabcccccaaa";
        compress(str);
        
    }
    
}
