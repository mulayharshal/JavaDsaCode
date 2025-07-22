public class RemoveDupliCates {
    public static void main (String [] args){
        String str="appnnacollege";
        removeDupli(str, 0,new StringBuilder(""),new boolean[26]);
    }
    public static void removeDupli(String str , int indx, StringBuilder newStr, boolean map[] ){
        if(indx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currchar=str.charAt(indx);
        if(map[currchar-'a']== true){
            removeDupli(str, indx+1, newStr, map);
        }else{
            map[currchar-'a']= true;
            removeDupli(str, indx+1, newStr.append(currchar), map);
        }
    }
    
}
