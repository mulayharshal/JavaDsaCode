public class Quation1 {
    
    // Q.  Print the number of 7’s that are inthe 2d array
    public static void main (String [] args){
        int matrix[][]={{4,7,8},{8,8,7}};

        int count7=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count7++;
                }
            }
        }
        System.out.println("the 7 are present in array "+count7+" times");
    }
}
