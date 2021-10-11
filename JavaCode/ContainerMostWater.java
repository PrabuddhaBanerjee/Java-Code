//https://leetcode.com/problems/container-with-most-water/
//Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        int start = 0, end = height.length-1;
        while(start<end){
            // System.out.println(maxarea);
            maxarea = Math.max(maxarea, Math.min(height[start], height[end])*(end-start));
            if(height[start]< height[end])
                start++;
            else end--;
        }
        return maxarea;
    }
}
