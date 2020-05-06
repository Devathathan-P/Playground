import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int max = 0;
      for ( int i = 0 ; i < size ; i++)
      {
        arr[i] = in.nextInt();
        if (arr[i] > max)
          max = arr[i];
      }
      System.out.println(max);
    }
}