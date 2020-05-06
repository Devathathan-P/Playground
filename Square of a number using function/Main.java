import java.util.Scanner;
class Main
{
  public static int square ( int a)
  {
    System.out.println(a*a);
    return 1;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      square(n);
	} 
}