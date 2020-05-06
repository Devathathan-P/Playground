import java.util.Scanner;
class Main
{
  public static int is_prime ( int a )
  {
    int sum;
    for ( int i = 2; i <=a; i++)
    {
      sum = 0;
      for ( int j = 1; j<=i; j++)
      {
        if ( i % j == 0)
          sum = sum + j;
      }
      if (sum == 1+i)
        System.out.println(i);
    }
    return 1;
  }
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    is_prime ( n );
  }
}