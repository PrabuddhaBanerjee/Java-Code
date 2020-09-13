import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
/**
 * The PatternCheck program computes the pattern and the String of words
 * @author Prabuddha Banerjee
 * @version 1.0
 * @since   2020-09-13
 */
public class PatternCheck {
  /**
     * This is the wordPattern method which Uses ArrayList to compute the
     * allowed patterns. It return output fastest as compared to 100 other
     * solutions
     * @param args pattern: String of Characters
     * @param args str: String of space separated words
     * @return boolean.
     */
  public static boolean wordPattern(String pattern, String str) {
    String[] fetch = str.split(" ");
    List<Character> num = new ArrayList<Character>();
    List<String> s = new ArrayList<String>();
    if(pattern.length()!=fetch.length)
      return false;
    for(int i = 0; i<fetch.length; i++){
      if((num.size()!=0)&&(num.contains(pattern.charAt(i)))){
        int idx = num.indexOf(pattern.charAt(i));
        if(!s.get(idx).equals(fetch[i])){
          return false;
        }
      }
      else {
        if((num.size()==0)||(!s.contains(fetch[i]))){
          s.add(fetch[i]);
          num.add(pattern.charAt(i));
        }
        else if(i<=(fetch.length-1)){
           continue;
        }
        else return false;
      }
    }
    return true;
  }
  /**
     * This is the wordPatternHash method which Uses Hashmap to compute the
     * allowed patterns. This returns the output with least memory used for the
     * solution
     * @param args pattern: String of Characters
     * @param args s: String of space separated words
     * @return boolean.
     */
  public static boolean wordPatternHash(String pattern, String s){
   String[] word = s.split(" ");
   HashMap<Character, String> map = new HashMap<Character, String>();
   boolean output = true;
   if(word.length != pattern.length())
     return false;
   for(int i=0; i<word.length; i++){
     if(!map.containsKey(pattern.charAt(i))){
       if(!map.containsValue(word[i])){
         map.put(pattern.charAt(i), word[i]);
       }
       else return false;
     }
     else{
       if(!map.get(pattern.charAt(i)).equals(word[i]))
         return  false;
     }
   }
   return true;
  }
  /**
     * This is the main method which calls the two methods and prints the
     * output simultaneously as boolean.
     *
     * @param args Unused.
     * @return Nothing.
     */
  public static void main(String[] args){
    // System.out.println(wordPatternHash("ccccccccccccccccccccccccccccccccccccc
    //ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc
    //ccccccccccccccccccdd", "s s s s s s s s s s s s s s s s s s s s s s s s s
    //s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s
    //s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s
    //s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t"));
      System.out.println(wordPattern("abba", "cat dog cat cat"));
   }
}
