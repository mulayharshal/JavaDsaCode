public class GridWays {
    public static void main(String [] args){
        int n=2;
        int arr[][]=new int [n][n];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                arr[i][j]=0;
            }
        }
        int ways=findWays(arr,  0, 0);
        System.out.println(ways +" ways ");


    }
    public static void printArr(int arr[][]){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
    public static int findWays(int arr[][],int i,int j){
        if(i==arr.length || j==arr.length){
            return 0;
        }
        if(i==arr.length-1 && j==arr.length-1 ){
            arr[i][j]=1;
            printArr(arr);
            return 1;
        }
        arr[i][j]=1;
        int row=findWays(arr, i+1, j);
        int col=findWays(arr, i, j+1);
         arr[i][j]=0;
         return row+col;
    }
}
