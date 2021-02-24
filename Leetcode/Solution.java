/*Given an array nums with n integers, your task is to check if it could become
non-decreasing by modifying at most 1 element.
We define an array is non-decreasing if nums[i] <= nums[i + 1] holds for every
i (0-based) such that (0 <= i <= n - 2).
Example 1:
Input: nums = [4,2,3]
Output: true
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
Input: nums = [4,2,1]
Output: false
Explanation: You can't get a non-decreasing array by modify at most one element.
*/
class Solution {
    public static boolean checkPossibility(int[] nums) {
        boolean flag = false;
        boolean checked = false;
        int countdec = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
          for(int j = i+1;j<nums.length;j++){
            if((nums[i]!=nums[j])&&(!checked)){
              if((i<=(nums.length-2) && (nums[i]<=nums[i+1]))){
                flag=true;
              }
              else countdec++;
              checked = true;
            }
            else if(nums[i]==nums[j])
              count++;
          }
          checked = false;
        }
System.out.println("countdec" + countdec + " count"+count);
        if((countdec>0)&&(count>0))
          return flag =false;
        else return flag;
    }
   public static void main(String[] args){
     int[] num = new int[]{3,1,2,3};
     System.out.println(checkPossibility(num));
   }
}
