public class QShotestPath {
    public static void pathS(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char way=path.charAt(i);
            if(way == 'N'){
                y++;
            }else if(way =='S'){
                y--;
            }else if (way=='E') {
                x++;
            }else if(way=='W'){
                x--;
            }
        }

        double length=Math.sqrt(x*x+y*y);
        System.out.println("shortest path dististination is the : "+length);

    }
    public static void main(String []args){
        String path="WNEENESENNN";

        pathS(path);

    }
    
}
