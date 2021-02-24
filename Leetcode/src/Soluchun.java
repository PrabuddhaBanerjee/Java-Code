import java.util.Scanner;

class Solution {
    public static boolean  isNumber(String s) {
        // String[] str = s.split();
        boolean flag = false;
        int count_sign = 0;
        int count_e = 0;
        s = s.trim();
        if(((s.length()==1)&&((s.charAt(0)<48)||(s.charAt(0)>57)))){
    		return flag = false;
    		}
        for(int i = 0; i<s.length(); i++){
            if(((s.charAt(i)>=48)&&(s.charAt(i)<=57) )){
            	if(count_e>0)
              	  return flag = false;
                flag = true;
                }
            else if(s.charAt(i)==101){
            	count_e++;
            	flag = true;
            	}
            else if((s.charAt(i)==46)){
            	if(count_e>0)
            	  return flag = false;
            	else flag = true;
            }
            else if((s.charAt(i)==45)){
            	if(count_sign<1){
            		count_e  = 0;
            		count_sign++;
	            	flag = true;
            	}
            	else return flag = false;
            }
            else {
            	flag = false;
            	break;
            }
        }
        return flag;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		boolean check = isNumber(str);
		System.out.println(check);
		input.close();
	}

}
