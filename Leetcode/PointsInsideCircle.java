// https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
/***
   * file: PointsInsideCircle.java
   * author: Prabuddha Banerjee
   * due date: July 28, 2021
   * version: 1.1
   *
   * This file contains the declaration of the
   * PointsInsideCircle a solution of Leetcode question.
*/
/**
  * PointsInsideCircle
  *
  * This class implements a method in which the input
  * takes a array and finds if points are inside the circle.
  */
class PointsInsideCircle{
    /**
        * countPoints
        *
        * Parameters:
        *   points: 2D array of points which compute the Array of integer
        *   queries: 2D array of points which has array of x,y and r points.
        * Return value: Array of integers in which are equivalent to alphabets.
   */
    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] output = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];
            int count = 0;
            for(int j=0; j<points.length; j++){
                int xi = points[j][0];
                int yi = points[j][1];
                int xaxis = (xi-x)*(xi-x);
                int yaxis = (yi-y)*(yi-y);
                if(Math.sqrt(xaxis+yaxis) <= r){
                    count++;
                }
            }
            output[i] = count;
        }
        return output;
    }
}