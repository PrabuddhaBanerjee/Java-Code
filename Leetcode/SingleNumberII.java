class SingleNumberII{
  public static int singleNumber(int[] nums) {
    int output = 0;
    for(int i = 0; i<nums.length; ){
      System.out.println(i);
      if(((i+2)<nums.length-1)&&(nums[i] == nums[i+1])&&(nums[i] == nums[i+2])){
        i+= 3;
      }
      else if(((i+2)<nums.length-1)&&(nums[i] == nums[i+1])&&((i+2)<nums.length-1)){
        i +=2;
      }
      else if(((i+2)<nums.length-1)&&(nums[i] == nums[i+2])&&((i+1)<nums.length-1)){
        i+=1;
        break;
      }
      else output = nums[i];
    }
    return output;
  }
  public static void main(String[] args){
    int[] arr = new int[]{2,2,3,2};
    System.out.println(singleNumber(arr));
  }
}
