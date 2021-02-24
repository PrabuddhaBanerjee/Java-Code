class SortColors {
  public static void solution(int[] nums) {
    for(int i = 0; i<nums.length -1; i++){
      if(nums[i] > nums[ i+1]){
        int temp = nums[i];
        nums[i] = nums[i+1];
        nums[i+1] = temp;
        i = -1;
      }
    }
    printVal(nums);
  }
  private static void printVal(int[] arr){
    for(int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args){
    int[] num = new int[]{2,0,2,1,1,0};
    solution(num);
  }
}
