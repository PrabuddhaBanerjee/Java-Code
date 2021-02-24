/**
Given a non-empty array of integers, every element appears twice except for
 one. Find that single one.
Note:
Your algorithm should have a linear runtime complexity. Could you implement
it without using extra memory?
*/
public class SingleNumber{
  public static int singleNumber(int[] nums) {
    boolean flag = false;
    for(int i = 0; i<nums.length; i++){
      for(int j = 0; (j<nums.length); j++){
        if(i!=j){
          if(nums[i] == nums[j]){
            flag = true;
          }
        }
      }
      if(flag == true)
        flag = false;
      else return nums[i];
    }
    return 0;
  }
  public static int efficientSol(int[] nums)}{
    int[] arr1 = new int [1];
    int[] arr2 = new int [nums.length/2];
    for(int i = 1; i<nums.length; i++){
      arr2[i-1] = arr2[0];
    }
  }
  public static void main(String[] args){
    int[] arr = new int[]{4,1,2,1,2};
    // System.out.println(singleNumber(arr));
    System.out.println(efficientSol(arr));
  }
}
