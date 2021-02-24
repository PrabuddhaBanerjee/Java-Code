//A= 65 to Z= 90
//a = 97 to z = 122
class DetectCapital {
  public static boolean detectCapitalUse(String word) {
    int num = word.length();
    int cap = 0;
    for(int i = 0; i<num; i++){
      if(word.charAt(i)>64 && word.charAt(i)<91){
        cap++;
      }
    }
    if(cap == num)
      return true;
    else if((cap == 1)&&(word.charAt(0)>64 && word.charAt(0)<91))
      return true;
    else if(cap == 0)
       return true;
    else return false;
  }
  public static void main(String[] args){
    System.out.println(detectCapitalUse("EEJIHEHEFIEFBBBBaefanfnawjfbawebf"));
    // Case 534/550
    // EEJIHEHEFIEFBBBBaefanfnawjfbawebf
  }
}
// public boolean detectCapitalUse(String word) {
//         int n= word.length();
//         int caps=0;
//         for(int i=0;i<n;i++)
//             if(word.charAt(i)-'A'<26)
//                 caps++;
//
//         if(caps==n) return true;
//         else if(caps==1 && word.charAt(0)-'A'<26) return true;
//         else if(caps==0)  return true;
//         else return false;
//     }
