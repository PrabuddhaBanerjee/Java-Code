public class ReverseInteger{
  public int reverse(int x) {
    int length = 0;
    long num = 0;
    long temp = 1;
    boolean negative = false;
    if(x != Math.abs(x)){
      negative = true;
    }
    x = Math.abs(x) ;
    while (temp <= x){
      length ++;
      temp *= 10;
    }
    for(int i = 1; i<=length; i++){
      num += Math.pow(10 , (length-i)) * (x % 10);
      x = (x - (x % 10))/10;
    }
    if((num> Integer.MAX_VALUE)||(num < Integer.MIN_VALUE))
      return 0;
    if(negative == true){
      return (int)num * -1;
    }
    else return (int)num;
  }
/**
* public int reverse(int x) {
*  int rev = 0;
*  while (x != 0) {
*   int pop = x % 10;
*   x /= 10;
*   if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
*     return 0;
*   if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
*     return 0;
*   rev = rev * 10 + pop;
*  }
*  return rev;
*}
*/
}
