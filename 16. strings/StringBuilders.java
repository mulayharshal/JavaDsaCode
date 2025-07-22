import java.util.*;

public class StringBuilders {
    public static void main(String args[] ){

        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        // time O(26)
        System.out.println(sb);
    }
}
 