import java.util.Scanner;
class Main
{
  public static int max_index( int arr[] , int size)
  {
    int max = 0 ;
    for ( int i = 0 ; i < size ; i++)
    {
      if ( arr[i] > max)
        max = arr[i];
    }
    for ( int i = 0 ; i < size ; i++)
    {
      if ( arr[i] == max )
        System.out.println(i);
    }
    return 0;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int array[] = new int[n];
    for ( int i = 0 ; i< n ; i++)
      array[i] = in.nextInt();
    max_index( array , n );
  }
}