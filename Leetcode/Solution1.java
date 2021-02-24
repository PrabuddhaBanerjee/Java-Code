class Solution1 {
    public static boolean checkPossibility(int[] nums) {
        boolean flag = false;
        int count = 0, same = 0;
        for(int i = 0; i<nums.length; i++){
          for(int j = i+1;j<nums.length;j++){
            if(nums[i]>nums[j]){
              int temp = num[i];
              num[i] = num[j];
              num[j] = temp;
              count++;
             }
          }
        }
System.out.println("count"+count+"same"+same);
        // if((count!=0)&&((count+same)>=(nums.length)))
          if(count>1)
          return flag = false;
        else return flag = true;
    }
   public static void main(String[] args){
     int[] num = new int[]{1,5,4,6,7,10,8,9};
     System.out.println(checkPossibility(num));
   }
}
