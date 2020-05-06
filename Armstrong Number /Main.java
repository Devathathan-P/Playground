import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0 , digits = 0;
      int temp = n , last_digit;
      while (temp/10>=1)
      {
        temp = temp / 10;
        digits = digits + 1;
      }
      temp = n;
      for ( int i = 1; i <= digits; i++)
      {
        last_digit = temp % 10;
        sum = sum + (last_digit * last_digit * last_digit );
        temp = temp / 10;
      }
      sum = sum + (temp * temp * temp );
      if ( sum == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}