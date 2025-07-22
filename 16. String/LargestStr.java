public class LargestStr {
    public static void main(String[] args) {
        String fruits[]={"apple", "mango", "banana"};

         String large=fruits[0];
         for (int i=0; i<fruits.length;i++){
            if(large.compareTo(fruits[i] )<0){
                large=fruits[i];
            }
         }
         System.err.println(large);
         
    }
}
