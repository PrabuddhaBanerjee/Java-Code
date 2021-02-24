public class MaxSubArray{
  public static int solution(int[] nums){
    int sum = 0;
    if(nums.length > 4){
      for(int i = 0; i<nums.length-4; i++){
        int tempSum = nums[i] + nums[i+1] + nums[i+2] + nums[i+3] ;
        System.out.println("temp:"+tempSum);
        if(sum < tempSum)
          sum = tempSum;
      }
    }
    else{
        for(int j = 0; j< nums.length ; j++)
            sum += nums[j];
    }
    return sum;
  }
  public static void main(String[] args){
    int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(solution(arr));
  }
}
