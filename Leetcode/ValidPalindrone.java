class ValidPalindrone{
  public static boolean isPalindrome(String s) {
    String str1 = s.toLowerCase();
    String str2 = str1.replaceAll("[:,.]","");
    String str = str2.replace(" ","");
    System.out.println(str);
    int j = str.length()-1;
    for(int i =0; i<str.length()/2; i++){
      if(str.charAt(i)==str.charAt(j)){
        j--;
      }
      else return false;
    }
    return true;
  }
  public static void main(String[] args){
    System.out.println(isPalindrome("a."));
  }
}
