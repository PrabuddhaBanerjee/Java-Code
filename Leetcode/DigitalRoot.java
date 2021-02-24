class DigitalRoot {
  public static int addDigits(int num) {
    int total = 0;
    while(num > 0){
      total = total + (num % 10);
      num = num/10;
    }
    return total;
  }
  public static void main(String[] args){
    System.out.println(addDigits(38));
  }
}
