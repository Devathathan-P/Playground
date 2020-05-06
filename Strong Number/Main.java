import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
      int temp = n;
      int last_digit, digits = 0, sum = 0;
      while (temp/10>=1)
      {
        last_digit = temp % 10;
        temp = temp / 10;
        int fact = 1;
        for ( int i = 1; i <= last_digit; i++)
          fact = fact * (i);
        sum = sum + fact;
      }
      sum = sum + temp;
      if (sum == n )
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}