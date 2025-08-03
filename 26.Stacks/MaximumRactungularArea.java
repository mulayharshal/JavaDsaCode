public class MaximumRactungularArea {

    public static int rMax(int heights[],int i){
        int count=0;
        int j=i+1;
        while(j<heights.length && heights[j]>=heights[i]){
            count++;
            j++;
        }
        return count;
    }
    public static int lMax(int heights[],int i){
        int count=0;
        int j=i-1;
        while(j>=0 && heights[j]>=heights[i]){
            count++;
            j--;
        }
        return count;
    }
    public static int maxArea(int heights[],int area,int i){
        if(i==heights.length){
            return area;
        }
        int lMax=lMax(heights, i);
        int rMax=rMax( heights, i);
        int newArea=heights[i]*(lMax+rMax+1);

         area = Math.max(area, newArea);
        
        return maxArea(heights, area, i+1);
    }
    public static void main(String []a){
       int heights[]={2,1,5,6,2,3};
       int maxA= maxArea(heights, 0, 0);
       System.out.println(maxA);
    }
    
}
