import java.util.ArrayList;
class KFactor{
  public static int kthFactor(int n, int k){
    int i = 1;
    List<Integer> arr = new ArrayList<Integer>();
    while(i<=n){
      if(n%i==0)
          arr.add(i);
      i++;
    }
    if(arr.size()<k)
      return -1;
    return arr.get(k-1);
  }
  public static int solution2(int n, int k){
    int nthfactor = -1;
    if(k == 1)
      return k;
    int count = 0;
    for(int i=1;i<=n; i++){
      if(n%i == 0)
        count++;
      if(count == k){
        nthfactor = i;
        break;
      }
    }
    return nthfactor; 
  }
  public static void main(String[] args){

  }
}
