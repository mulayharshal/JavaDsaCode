public class ShortestPathQ {
   
    public static void path(String name){
        int x=0,y=0;
        
        for (int i=0; i<name.length();i++){
            //west
            if(name.charAt(i)=='w'){
                x--;
            }
            //east
            else if(name.charAt(i)=='E'){
                 x++;
            }
            //north
            else if(name.charAt(i)=='N'){
                y++;
           }
           //south
           else if(name.charAt(i)=='S'){
            y--;
            }
        }
        int length=(x*x)+(y*y);
        int path =(int)Math.sqrt(length);
        System.out.println(path);

    }
    public static void main(String [] args){
        String name="WNEENESENNN";
        path(name);

    }
    
}
