import java.util.Scanner;
class Main
{
  public static void sg (int array[], int size)
  {
    Scanner in = new Scanner(System.in);
    int zero_count=0;
    int rem;
    for (int i = 0; i < size; i++)
    {
      if (array[i] == 0)
        zero_count++;
    }
    int zero[] = new int[zero_count];
    rem = size - zero_count;
    int rest[] = new int[rem];
    int ind_rest = 0;
    for (int i = 0; i <size; i++)
    {
      if( array[i] != 0 )
      {
        rest[ind_rest] = array[i];
        ind_rest++;
      }
    }
    for( int i = 0; i < size; i++)
    {
      if (i < rem)
        array[i] = rest[i];
      else
        array[i] = 0;
    }
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for ( int i = 0; i < n; i++)
      arr[i] = in.nextInt();
    sg(arr,n);
    for ( int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
  }
}