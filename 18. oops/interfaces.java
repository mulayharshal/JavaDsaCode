public class interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();

        Player p=new Player();
        p.haveMusic();
        p.haveVideo();
    }
}

//abstract 100% by default
 interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("Queen can move in any direction");
    }
}
class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("Rook can move horizontally or vertically");
    }
}
class King implements ChessPlayer{
    public void moves() {
        System.out.println("King can move one square in any direction");
    }
}

//multiple interfaces
interface music{
    public void haveMusic();
}
interface Video{
    public void haveVideo();
}
class Player implements music,Video{
    public void haveMusic() {
        System.out.println("Player has music");
    }
    public void haveVideo(){
        System.out.println("Player has video");
    }
}