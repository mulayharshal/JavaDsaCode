public class LogoestWordIndictionary {
    static class Node {
        Node childrens[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                childrens[i] = null;
            }
        }

    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.childrens[idx] == null) {
                curr.childrens[idx] = new Node();
            }
            curr = curr.childrens[idx];
        }
        curr.eow = true;
    }

    public static String ans="";
    public static void longestWord(Node root,StringBuilder temp){
        
        for(int i=0;i<26;i++){
            Node curr=root.childrens[i];
            if(curr!=null){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(curr.eow && temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestWord(curr, temp);
            }
        }
    }

    public static void main(String a[]) {
        String words[] = { "w", "wo", "wor", "worl", "world" };
        for(String word:words){
            insert(word);
        }
        longestWord(root, new StringBuilder());
        System.out.println(ans);
    }
}
