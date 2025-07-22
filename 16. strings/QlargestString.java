public class QlargestString {
    public static void main (String [] args){
        String fruits[]={"apple", "mango","banana"};
        String largest=fruits[0];

        for(int i=0; i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }

        /* in the following compaer to function 
         * if they rtrun 0 both string are same
         * if  they return -ve(<0) 1st (largest) is small 
         * if they return +ve(>0) 1st is grater
         */


        System.out.println(largest);  
    }
}
