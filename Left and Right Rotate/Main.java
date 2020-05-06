import java.util.Scanner;
class Main 
{
  public static void rotate_left( int array[], int size)
  {
    int temp = array[0];
    int i;
    for ( i = 0; i < size-1 ; i++ )
      array[i] = array[i+1];
    array[i] = temp;
  }
   public static void rotate_right( int array[], int size)
  {
    int temp = array[size-1];
    int i;
    for ( i = size-1; i > 0 ; i-- )
      array[i] = array[i-1];
    array[i] = temp;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int no_odd = 0;
    int no_even = 0;
    for ( int i = 0 ; i < n ; i++)
    {
      arr[i] = in.nextInt();
      if ( i % 2 ==0 )
        no_odd++;
      else
        no_even++;
    }
    int odd[] = new int[no_odd];
    int even[] = new int[no_even];
    int ind_odd = 0;
    int ind_even = 0;
    for ( int i = 0; i < n; i = i + 2 )
    {
      odd[ind_odd] = arr[i];
      ind_odd++;
    }
    for ( int i = 1; i < n; i = i + 2 )
    {
      even[ind_even] = arr[i];
      ind_even++;
    }
    int rot = in.nextInt();
    for ( int i = 0; i < rot ; i++)
    {
      rotate_right( odd, no_odd );
      rotate_left( even, no_even );
    }
    ind_odd = 0;
    ind_even = 0;
    for ( int i = 0; i < n ; i++ )
    {
      if( i % 2 == 0)
      {
        arr[i] = odd[ind_odd];
        ind_odd++;
      }
      else
      {
        arr[i] = even[ind_even];
        ind_even++;
      }
    }
     for ( int i = 0 ; i < n ; i++ )
        System.out.print(arr[i] + " ");
  }
}