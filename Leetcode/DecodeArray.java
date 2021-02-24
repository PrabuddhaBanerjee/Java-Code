/***
 * There is a hidden integer array arr that consists of n non-negative integers.
 * It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. 
 * For example, if arr = [1,0,2,1], then encoded = [1,2,3].
 * You are given the encoded array. You are also given an integer first, 
 * that is the first element of arr, i.e. arr[0].
 * Return the original array arr. It can be proved that the answer exists and is unique.
 */ 
//e.g. I/P: encoded = [1,2,3], first = 1    O/P: [1,0,2,1]
class DecodeArray{
    public static int[] decode(int[] encoded, int first){
        // Time Complexity: O(N)
        // Space Complexity: O(N)
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for(int i=0; i<encoded.length; i++){
            arr[i+1] = encoded[i]^arr[i];
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[]{6,2,7,3};
        int n = 4;
        arr = decode(arr, n);
        for(int i:arr)
            System.out.print(i+" ");    
    }
}