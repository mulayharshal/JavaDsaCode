import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] a) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };


        // sorting
        int activites[][]=new int [start.length][3];
        for(int i=0;i<start.length;i++){
            activites[i][0]=i;
            activites[i][1]=start[i];
            activites[i][2]=end[i];
        }

        // lamda function -> shortform
        Arrays.sort(activites,Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lasEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lasEnd) {
                // activity select
                maxAct += 1;
                ans.add(i);
                lasEnd = end[i];
            }
        }

        System.out.println("max activity " + maxAct);
        System.out.println(ans);
    }
}