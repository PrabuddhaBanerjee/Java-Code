/***
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
 *  followed by all the odd elements of A.You may return any answer array that satisfies this condition.
 */
// 
class ArrayByParity{
    public int[] sortArrayByParity(int[] A) {
        int len = 0;
        for (int i=0; i<A.length; i++) {
            int ele = A[i];
            if (ele%2 == 0) {
                A[i] = A[len];
                A[len++] = ele;
            }
        }
        return A;
    }
    public int[] solution(int[] A){
        int[] arr = new int[A.length];
        int odd = A.length - 1;
        int even = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]%2 == 0){
                arr[even] = A[i];
                even++;
                }
            else{
                arr[odd] = A[i];
                odd--;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[4]{3,1,2,4};
        arr = sortArrayByParity(arr);
        for(int i: arr)
            System.out.println(i+" ");

    }
}