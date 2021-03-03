
class ShuffleString{
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<indices.length; i++){
            arr[indices[i]] = s.charAt(i);
        }
        for(int j=0; j<indices.length; j++){
            sb.append(arr[j]);
        }
        return sb.toString();
    }
    public String optimalSolution(String s, int[] in) {
        char[] arr = new char[in.length];
        for(int i = 0; i < in.length; i++)
            arr[in[i]] = s.charAt(i);
        return new String(arr);
    }
    public String betterSolution(String s, int[] indices) {
        // Time Complexity: O(N)
        // Space Complexity: O(N)
        char[] arr = new char[s.length()];
        
        for (int i=0; i<arr.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args){
        String str = "aiohn";
        int[] ar = new int[]{3,1,4,2,0};
        System.out.println(restoreString(str, ar));
    }
}