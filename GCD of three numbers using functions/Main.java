import java.util.Scanner;
class Main
{
  public static int gcd( int a, int b)
  {
    int num = 1;
    if ( a > b)
    {
      for ( int i = 1 ; i <= a; i++)
      {
        if ( a % i == 0 && b % i == 0)
          num = i;
      }
    }
    else
    {
      for ( int i = 1 ; i <= a; i++)
      {
        if ( a % i == 0 && b % i == 0)
          num = i;
      }
    }
    return num;
  }
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    int temp = gcd ( n1 , n2 );
    System.out.println( gcd ( temp , n3 ) );
  }
}