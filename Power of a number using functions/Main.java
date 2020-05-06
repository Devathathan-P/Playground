import java.util.*;
class Main
{
  public static int power (int a, int b)
  {
    int pow = 1;
    for ( int i = 1; i <=b; i++)
      pow=pow*a;
    System.out.println(pow);
    return 0;
  }
  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    power ( base , exponent );
  }
}
    