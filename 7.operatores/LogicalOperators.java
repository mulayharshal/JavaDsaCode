public class LogicalOperators {
    //Logical Operators AND OR NOT
    public static void main(String[] args) {
        
        // and operator &&
        System.out.println((7<9)&&(4>2));// true true
        System.out.println((5<9)&&(7<4));// true false
        System.out.println((7<3)&&(5>2));// false true
        System.out.println((6<2)&&(9<0));// false false

        System.out.println("_______________");
        //logicla or ||
        System.out.println((7<9)||(4>2));// true true
        System.out.println((5<9)||(7<4));// true false
        System.out.println((7<3)||(5>2));// false true
        System.out.println((6<2)||(9<0));// false false

         System.out.println("_______________");
         //Logicla Not !
        System.out.println(!(5<9));// true 
        System.out.println(!(7<3));// false

    }
    
}
