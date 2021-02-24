class SearchInsert {
  public static int solution(int[] nums, int target) {
    int count = 0;
    boolean check = false;
    for(int i = 0; i< nums.length; i++){
      if(target == nums[i]){
        count = i;
        check = true;
      }
    }
    if(check == false){
      for(int i = 0; i < nums.length; i++){
        if(target < nums[i]){
          count = i;
          check = true;
          break;
        }
        if((i == nums.length-1)&&(nums[i] < target)){
          count = nums.length;
          check = true;
        }
      }
    }
   return count;
  }
  public static void main(String[] args){
    // Case1: number is out of range at 
    int[] num = new int[]{1,3,5,6};
    System.out.println(solution(num, 7));
    // Case1: number is out of range
    // int[] num = new int[]{1,3,5,6};
    // System.out.println(solution(num, 0));
    // Case1: number is in between of the range
    // int[] num = new int[]{1,3,5,6};
    // System.out.println(solution(num, 4));
  }
}
