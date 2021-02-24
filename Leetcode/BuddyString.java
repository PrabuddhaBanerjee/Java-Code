public class BuddyString{
  private static boolean buddyStrings(String A, String B){
    int pos1 = 0, pos2 = 0;
    // if(A == B)
    //   return true;
    // else {
      if(A.length() == B.length()){
        for(int i = 0; i<A.length(); i++){
          if((A.charAt(i) != B.charAt(i)) && (pos1 != 0) && (pos2 != 0)){
            if(pos1 == 0)
              pos1 = i ;
            else if(pos2 == 0)
              pos2 = i ;
            else return false;
          }
        }
      }
      else {
System.out.println("2");
        return false;
      }
    if ((pos1 == 0) && (pos2 == 0)){
System.out.println("3");
      return false;
    }
    else return true;
  }
  public static void main(String[] args){
    System.out.println("1:"+buddyStrings("ab","ba"));
    System.out.println("2:"+buddyStrings("ab","ab"));
    System.out.println("3:"+buddyStrings("aa","aa"));
    System.out.println("4:"+buddyStrings("aaaaabc","aaaaacb"));
    System.out.println("5:"+buddyStrings("","aa"));
 }
}
