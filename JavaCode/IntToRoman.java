class Solution {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        convertToString(num, str);
        return str.toString();
    }
    public void convertToString(int num, StringBuilder str){
        if(num >= 10){
            str.append("X");
            convertToString(num-10, str);
        }
        else if(num >= 9){
            str.append("IX");
            convertToString(num-9, str);
        }
        else if(num>=5){
            str.append("V");
            convertToString(num-5, str);
        }
        else if(num>=4){
            str.append("IV");
            convertToString(num-4, str);
        }
        else if(num>=1){
            str.append("I");
            convertToString(num-1, str);
        }
        else if(num==0){
            return ;
        }
        return;
    }
}
