/***
 * for multiples of three it should output “Fizz” instead 
 * of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five 
 * output “FizzBuzz”.
 */
import java.util.ArrayList;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<String>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5 == 0)
                arr.add("FizzBuzz");
            else if(i%3 == 0)
                arr.add("Fizz");
            else if(i%5 == 0)
                arr.add("Buzz");
            else arr.add(Integer.toString(i));
        }
        return arr;
    }
    // public List<String> fizzBuzz(int n) {
    //     List<String> arr = new ArrayList<String>();
    //     for(int i=1; i<=n; i++){
    //         String str = "";
    //         if(i%3 == 0)
    //             str+= "Fizz";
    //         if(i%5 == 0)
    //             str+= "Buzz";
    //         if(str=="")
    //             arr.add(String.valueOf(i));
    //         else arr.add(str);
    //     }
    //     return arr;
    // }
    //  public List<String> fizzBuzz(int n) {
    //     //Decreasing to modulo operator to +- from O(N^2) to O(N)
    //      List<String> arr = new ArrayList<String>();
    //      int c3 = 0;
    //      int c5 = 0;
    //     for(int i=1; i<=n; i++){
    //         String str = "";
    //         c3++;
    //         c5++;
    //         if(c3%3 == 0){
    //             str+= "Fizz";
    //             c3 = 0;
    //         }
    //         if(c5%5==0){
    //             str+="Buzz";
    //             c5 = 0;
    //         }
    //         if(str == "")
    //             arr.add(String.valueOf(i));
    //         else arr.add(str);
    //     }
    //     return arr;
    // }
}