// An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array A is monotone increasing if for all i <= j, A[i] <= A[j]. 
// An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
// Return true if and only if the given array A is monotonic.
//e.g.: I/P: [1,2,2,3] O/P: true
// [6,5,4,4] O/P: true
// [1,3,2]  O/P: false

class MonotonicArray{
    // Time Complexity : O(N^2)
    // Space Complexity : O(1)
    public static boolean isMonotonic(int[] A){
        boolean flag = false;
        if(A.length<=2)
            return true;
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length-1; j++){
                if((A[i]<=A[j])&&(A[j]<=A[j+1]))
                    flag = true;
                else if((A[i]>=A[j])&&(A[j]>=A[j+1]))
                    flag = true;
                else {
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean optimalSol(int[] A){
        boolean dec = true;
        boolean inc = true;
        for(int i=0; i<A.length-1; i++){
            if(A[i]<A[i+1])
                dec = false;
            else if(A[i+1]<A[i])
                inc = false;
        }
        return inc||dec;
    }

    public static void main(String[] args){
        int [] arr = new int[]{1,3,2};
        //System.out.println(isMonotonic(arr));
        System.out.println(optimalSol(arr));
    }
}