import java.util.*;

public class Quation3 {
    //Write a program to FindTransposeofa Matrix.
    public static void transpose(int a[][],int b[][]){
        //move transpose and store other matrix
        for (int i=0 ; i<a.length;i++){
            for(int j=0; j<a[0].length;j++){
                    b[i][j]=a[j][i];
            }
        }
    }


    //for the printing the array 

    public static void print(int arr[][]){
        for (int i=0 ; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        int a[][]={ {1,4,9},{11,4,3},{2,2,3} };
        System.out.println("First Array");
        print(a);

        int b[][]=new int[a.length][a[0].length];
        transpose(a, b);
        System.out.println("New Array");
        print(b);
                
    }
    
}
