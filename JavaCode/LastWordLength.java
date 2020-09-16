 /**
  * The PatternCheck program computes the pattern and the String of words
  * @author Prabuddha Banerjee
  * @version 1.0
  * @since   2020-09-15
  */
class LastWordLength{
  /**
     * This is the lengthOfLastWord method which Uses String S to compute the
     * length of last word in two lines
     * solutions
     * @param args s: String of words
     * @return int.
     */
  public static int lengthOfLastWord(String s) {
    String[] word = s.split(" ");
    System.out.println(word.length);
    return word.length == 0 ? 0: word[word.length-1].length();
  }
  /**
     * This is the lengthOfLastWord method which Uses String S to compute the
     * length of last word in one lines.
     * @param args s: String of words
     * @return int.
     */
  public static int lengthOfLastWord1Line(String s) {
    //Hello World
    //11 - 5 - 1
    return s.trim().length() - s.trim().lastIndexOf(" ")-1;
  }
  /**
     * This is the main method which calls the two methods and prints the
     * output simultaneously as integer.
     *
     * @param args Unused.
     * @return Nothing.
     */
  public static void main(String[] args){
    // System.out.println(lengthOfLastWord("Hello World"));
    System.out.println(lengthOfLastWord1Line(" "));

  }
}
