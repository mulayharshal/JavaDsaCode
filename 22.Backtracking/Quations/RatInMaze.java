package Quations;

public class RatInMaze {
    public static void main(String [] args){
        int maze[][]={{1,0,0,0},
                    {1,1,0,1},
                    {0,1,0,0},
                    {1,1,1,1}};
    ratMaze(maze, 0, 0);
    printMaze(maze);
    
    }
    public static void ratMaze(int maze[][],int i,int j){
        //base case
        if(i==maze.length || j==maze.length){
            // printMaze(maze);
            return ;
        }
        if(maze[i][j]==0){
            return;
        }

        //recursion
        maze[i][j]=2;
        ratMaze(maze, i+1, j);
        ratMaze(maze, i, j+1);
        

    }
    public static void printMaze(int maze[][]){
        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze.length;j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--");
    }
    
}
