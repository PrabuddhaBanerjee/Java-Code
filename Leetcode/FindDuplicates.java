class FindDuplicates{
  public static int findDuplicate(int[] arr) {
    int count = 0;
    // for( int i = 0; i<nums.length-1; i++){
    //   if(((i+2)<nums.length)&&((nums[i] == nums[i+1])||(nums[i] == nums[i+2]))){
    //     count = nums[i];
    //   }
    //   else if(((i+1)<nums.length)&&(nums[i] == nums[i+1])){
    //     count = nums[i];
    //   }
    // }
    // for( int i = 0; i<nums.length-1; i++){
    //   for(int j = i+1; j<nums.length; j++){
    //     if(nums[i] == nums [j]){
    //       return count = nums[i];
    //     }
    //   }
    // }
    for( int i = 0; i<arr.length; i++){
    if (arr[ Math.abs(arr[i])] >= 0)
      arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])];
    else
      return count = Math.abs(arr[i]);
    }
    return count;
  }
  public static void main(String[] args){
    int[] arr = new int[]{3,1,3,4,2};
    System.out.println(findDuplicate(arr));
  }
}
