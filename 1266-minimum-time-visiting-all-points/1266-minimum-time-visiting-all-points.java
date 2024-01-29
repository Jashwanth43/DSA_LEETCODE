class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int time=0;
        for(int i=0;i<(points.length)-1;i++){
            int x_diff=Math.abs(points[i][0]-points[i+1][0]);
            int y_diff=Math.abs(points[i][1]-points[i+1][1]);
            if(x_diff<y_diff) {
                time +=x_diff;
                time +=y_diff-x_diff;
            }
            else {
               time +=y_diff;
                time +=x_diff-y_diff; 
            }
        }
        return time;
    }
}