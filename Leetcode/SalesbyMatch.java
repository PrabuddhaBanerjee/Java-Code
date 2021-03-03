import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SalesbyMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        // Time Complexity: O(N^2)
        // Space Cpmlexity: O(1)
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j= n-1 ; j>i; j--){
                if((ar[i]==ar[j])&&(ar[i]!=0)){
                    count++;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return count;
    }

    static int optimalSolution(int n, int[] ar){
        // Time Complexity: O(N)
        // Space Complexity: O(N)
        Set<Integer> color = new HashSet<>();
        int count = 0;
        for(int i=0; i<n; i++){
            if(!color.contains(ar[i])){
                color.add(c[i]);
            }
            else{
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}