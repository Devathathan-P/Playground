import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for ( int i = 1; i <= n; i++)
      {
        if ( i == 1 || i % n == 0)
        {
          for( int j = 1 ; j <= n ; j++)
            System.out.print("*");
          System.out.print("\n");
       }
        else
        {
           for(int j=1;j<=n;j++)
           {
           if(j==1 ||  j%n==0)
             System.out.print("*");
             
          else
            System.out.print(" ");
             
         }
          System.out.print("\n");
       }
      }
	}
}