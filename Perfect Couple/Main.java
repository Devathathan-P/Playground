import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for ( int i = 0 ; i < n ; i++ )
      arr[i] = in.nextInt();
    int search = in.nextInt();
    for ( int i = 0; i < n; i++)
    {
      for ( int j = i+1; j < n ; j++)
      {
        if ( arr[i]+arr[j] == search)
          System.out.println(arr[i] + ", " + arr[j]);
      }
    }
    }
  }