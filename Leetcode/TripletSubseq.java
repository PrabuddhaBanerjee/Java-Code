class TripletSubseq{
    public static boolean increasingTriplet(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            int j = i+1;
            int k = j+1;
            if(nums[i]<nums[j]){
                if(nums[j]<nums[k])
                    return true;
            }
            else{
                j++;
                
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = new int[]{20,100,10,12,5,13};
        System.out.println(increasingTriplet(arr));
    }
}
// [2,1,5,0,4,6]
// [5,4,3,2,1]
// [20,100,10,12,5,13]