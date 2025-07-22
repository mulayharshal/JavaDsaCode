public class substring {
    public static void substr(String str ,int si, int ei){

        String sub="";
        for(int i=si;i<ei;i++){
            sub+=str.charAt(i);
        }
        System.out.println(sub);
    }
    public static void main(String [] args){
        String str = "Hello World";
        substr(str, 0, 5);

        
        System.out.println(str.substring(0,5));
    }
    
}
