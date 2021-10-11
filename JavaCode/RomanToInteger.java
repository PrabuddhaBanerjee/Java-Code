//https://leetcode.com/problems/roman-to-integer/
//Roman to Integer
class Solution {
    public int romanToInt(String s) {
        if(s==null||s.length()==0)
            return 0;
        Map<Character, Integer> hm = new HashMap<>();
        int ans=0;
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        if(s.length()==1)
            return hm.get(s.charAt(0));
        for(int i=0; i<s.length()-1; i++){
            if((hm.get(s.charAt(i)))>=hm.get(s.charAt(i+1)))
                ans += hm.get(s.charAt(i));
            else ans -= hm.get(s.charAt(i));
        }
        ans += hm.get(s.charAt(s.length()-1));
        return ans;
    }
}
/***
public int romanToInt(String s) {
        int val = 0;
        for(int i=0; i<s.length(); i++){
            val = val + calValue(s.charAt(i), s, i);
        }
        return val;
    }
    public int calValue(char a, String s, int i){
        if(a=='M'){
            return 1000;
        }
        else if(a=='D'){
            return 500;
        }
        else if(a== 'C'){
            if((i<s.length()-1)&&((s.charAt(i+1)=='M')||(s.charAt(i+1)=='D'))){
                return -100;
            }
            else return 100;
        }
        else if(a== 'L'){
            return 50;
        }
        else if(a== 'X'){
            if((i<s.length()-1)&&((s.charAt(i+1)=='C')||(s.charAt(i+1)=='L'))){
                return -10;
            }
            else return 10;
        }
        else if(a== 'V'){
             return 5;
        }
        else if(a== 'I'){
            if((i<s.length()-1)&&((s.charAt(i+1)=='V')||(s.charAt(i+1)=='X'))){
                return -1;
            }
            else return 1;
        }
        return 0;

    }
*/
