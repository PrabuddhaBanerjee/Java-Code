class ReverseWord {
  public static String reverseWords(String s) {
    String str = s.trim();
    System.out.println(str);
    String[] arrStr = str.split(" ");
    //Print the input string after splitting
    for(int i = 0; i<arrStr.length; i++)
      System.out.println("..."+arrStr[i]+":");
    StringBuilder strB = new StringBuilder(arrStr[arrStr.length-1]);
    int count = arrStr.length-2;
    System.out.println(arrStr.length);
    while(count>=0){
      System.out.println(":"+arrStr[count]+":");
      strB.append(" "+arrStr[count]);
      count--;
    }
    //Print string after Building
    // System.out.println(strB);
    return strB.toString();
  }
  public static void main(String[] args){
    System.out.println(reverseWords("a good   example"));
  }
}
