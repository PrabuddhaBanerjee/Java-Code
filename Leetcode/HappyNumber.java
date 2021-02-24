import java.util.ArrayList;
public class HappyNumber{
  public static boolean isHappy(int n) {
    int count = 0;
    boolean flag = false;
    int temp = n;
    int sum = 0;
    ArrayList<Integer> arlist = new ArrayList<Integer>( );
    ArrayList<Integer> occ = new ArrayList<Integer>( );
    while(temp!=0){
      arlist.add(temp%10);
      temp /= 10;
      count++;
    }
    for(int i = 0; i<count; i++){
      sum += Math.pow(arlist.get(i), 2);
    }
 System.out.println(occ);
    if(occ.contains(sum))
      return flag = false;
    else if(sum == 1)
      flag = true;
    else {
      // temp = sum;
      // count = 0;
      // while(temp!=0){
      //   arlist.add(temp%10);
      //   temp /= 10;
      //   count++;
      // }
      // if(count>1)
        occ.add(sum);
        flag = isHappy( sum ) ;
      // else flag =  false;
    }
    return flag;
  }
  public static void main(String[] args){
    System.out.println(isHappy(2));
  }
}
