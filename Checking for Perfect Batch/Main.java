import java.util.Scanner;
class Main
{
  public static int batch_sum(int array[] , int size)
  {
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    for ( int i = 0 ; i < size ; i++)
    {
      if ( i < 3)
        sum1 = sum1 + array[i];
      if ( i < 6 && i > 2)
        sum2 = sum2 + array[i];
      if ( i < 9 && i > 5)
        sum3 = sum3 + array[i];
    }
    if ( size == 6 )
    {
      if (sum1 == sum2 )
        System.out.println("Perfect Batch");
      else 
        System.out.println("Not a Perfect Batch");
    }
     if ( size == 9 )
    {
      if (sum1 == sum2 && sum1 == sum3 )
        System.out.println("Perfect Batch");
      else 
        System.out.println("Not a Perfect Batch");
    }
    return 0;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for (int i = 0 ; i < n ; i++)
      arr[i] = in.nextInt();
    batch_sum( arr , n );
  }
}