public class practiceQ {

    //Q1
    public static void countVowels(String str){
        int count=0;
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='i' || ch=='e' || ch=='o' || ch=='u' ){
                count++;
            }
        }
        System.out.println("the vowels in this string is : "+count);
    }
    public static void main(String [] args ){
        //Q1
        //count vowels
        String stri="harshal";
        countVowels(stri);


        //q2
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
        
        //q3
        String str4 = "ApnaCollege".replace("l", "");
        System.out.println(str4);
        

    
        //just practice
        String str5="harshal";
        System.out.println(str5.toUpperCase());
        
    
    }
}
