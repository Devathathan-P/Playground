import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int first_digit;
      int last_digit;
      last_digit = n % 10;
      while (temp >= 10)
        temp = temp/10;
      first_digit = temp;
      System.out.println(first_digit + last_digit);
	}
}