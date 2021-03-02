import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TimeInWords {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String[] hr = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven","twelve"};
        String[] min = new String[]{"o' clock","one minute","two minutes", "three minutes", "four minutes", "five minutes", "six minutes","seven minutes", "eight minutes", "nine minutes", "ten minutes", "eleven minutes", "twelve minutes", "thirteen minutes", "fourteen minutes", "quarter", "sixteen minutes", "seventeen minutes", "eighteen minutes", "ninteen minutes", "twenty minutes", "twenty one minutes", "twenty two minutes", "twenty three minutes", "twenty four minutes", "twenty five minutes", "twenty six minutes","twenty seven minutes", "twenty eight minutes", "twenty nine minutes", "half"};
        String str;
        if((m<=30)&&(1<=m)){
            str = min[m] +" past ";
            return str+ hr[h-1];
        }
        else if(m>30){
            str = min[60-m] + " to ";
            return str+ hr[h];
        }
        else{
            return  hr[h-1]+" "+ min[0];
        }
        
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
