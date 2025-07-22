import java.lang.StringBuilder;
public class MyStringBuilder {
    public static void main(String args[]){
        StringBuilder sb= new StringBuilder("");
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
    
}
