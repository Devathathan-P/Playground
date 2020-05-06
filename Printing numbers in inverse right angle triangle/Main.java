import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int  n = in.nextInt();
      int k = n;
      for ( int i = 1; i <= n; i++)
      {
        k=n-(i-1);
        for ( int j = 1; j <=(n-(i-1)); j++)
        {
          System.out.print(k);
          k--;
        }
        System.out.print("\n");
      }
	}
}