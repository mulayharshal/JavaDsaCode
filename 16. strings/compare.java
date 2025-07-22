import javax.swing.plaf.synth.SynthStyleFactory;

public class compare {
    public static void main(String[] args){
        String s1="mulay";
        String s2="mulay";
        String s3= new String("mulay");

        if(s1==s2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if(s1==s3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if (s1.equals(s3)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
