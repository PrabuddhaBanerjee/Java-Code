// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//1 <= n <= 500
// nums.length == 2n
// 1 <= nums[i] <= 10^3
//e.g.: I/P: nums = [2,5,1,3,4,7], n = 3 O/P: [2,3,5,4,1,7] Explaination: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7
// I/P: nums = [1,2,3,4,4,3,2,1], n = 4 O/P: [1,4,2,3,3,2,4,1]
class ShuffleArray{
     //1. If Array is null return null array
     //2. If Array is size of 2 return the same array
     //3. If n=0 return same array
    public static int[] shuffle(int[] nums, int n){
        // Time Complexity: O(N)
        // Space Complexity: O(N)
        int[] arr = new int[nums.length];
        if((nums.length<2)||(n==0)||(nums==null))
            return nums;
        int j=0;
        for(int i=0; i<n; i++, j=j+2){
          arr[j] = nums[i];
          arr[j+1] = nums[n+i];
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,1,2,2};
        int n = 2;
        arr = shuffle(arr, n);
        for(int i: arr)
            System.out.print(i+" ");
    }
}