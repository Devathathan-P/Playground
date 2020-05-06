import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for ( int i =1; i<=n; i++)
      {
        for ( int j=1; j <= n; j++)
        {
          if (i%2==1 && j%n==0)
            System.out.print(i+1);
          else if (i%2==1 && j%n==0)
            System.out.print(i);
            else if (i%2!=1 && j==1)
              System.out.print(i+1);
          else 
            System.out.print(i);
        }
        System.out.print("\n");
      }
	}
}