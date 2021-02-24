public class ThirdMaximumNumber{
  public static int solution(int[] nums){
    int h = 0;
    int m = 0;
    int l = -2147483648;
    // for(int i = 0; i<nums.length-1; i++){
    //   if((nums[i]>nums[i+1])&&(temp<=nums[i])){
    //     temp = nums[i+1];
    //   }
    // }
    if(nums.length==1)
      return nums[0];
    else if(nums.length == 2){
      if(nums[0]>nums[1])
        return nums[0];
      else return nums[1];
    }
    else{
      for(int i = 0; i<nums.length; i++){
        if(nums[i]>h)
          h = nums[i];
        for(int j = 0; j<nums.length; j++){
          if(nums[j]>h)
            h = nums[j];
          else if((h>nums[j])&&(nums[j]>m))
            m = nums[j];
          else if((m>nums[j])&&(nums[j]>l))
            l = nums[j];
        }
      }
    }
    if(l == -2147483648)
      return h;
    return l;
  }
  public static void main(String[] args){
    int[] arr = new int[]{1,1,2};
    System.out.println(solution(arr));
  }
}
