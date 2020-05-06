import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int second_digit;
      while (temp >= 100)
        temp = temp/10;
      second_digit = temp%10;
      System.out.println(second_digit);
	}
}