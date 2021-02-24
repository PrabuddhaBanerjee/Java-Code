import java.util.*;
class StringCompare {
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> t1 = new Stack<Character>();
        int i=0;
        while(i < S.length()){
            System.out.println("Loop:"+i);
            if(s1.isEmpty()&&(S.charAt(i)=='#'))// ASCII "#" == 35
                continue;
            else if(S.charAt(i)!='#'){
                System.out.println("S1"+S.charAt(i));
                s1.push(S.charAt(i));
            }
            else s1.pop();        
            i++;
        }
        System.out.println("After 1");
        int j=0;
        while(j<T.length()){
            if(t1.isEmpty()&&(T.charAt(j)=='#'))// ASCII "#" == 35
                continue;
            else if(T.charAt(j)!='#'){
                t1.push(T.charAt(j));
            }
            else t1.pop();
            j++;
        }
        return s1.equals(t1); 
    }
    public static boolean optimalSolution(String S, String T){
        int i = S.length() - 1;
        int j = T.length() - 1;
        int skipS = 0, skipT = 0;
        while(i >= 0 || j >= 0){
            while(i >= 0){
                if(S.charAt(i) == '#'){
                    skipS++;
                    i--;
                }else if(skipS > 0){
                    skipS--;
                    i--;
                }else{
                    break;
                }
            }
            
            while(j >= 0){
                if(T.charAt(j) == '#'){
                    skipT++;
                    j--;
                }else if(skipT > 0){
                    skipT--;
                    j--;
                }else{
                    break;
                }
            }
            
            if(i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j)){
                return false;
            }
            
            if((i >= 0) != (j >= 0)){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
    public static boolean optimalSolution2(String S, String T){
        int idxS = S.length()-1;
        int idxT = T.length()-1;
        // if(idxS)
        for(int i=idxS; i>0; i--){
            
        }
    }
    public static void main(String[] args){
        System.out.println(backspaceCompare("a##c", "#a#c"));
    }
}