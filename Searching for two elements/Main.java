import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int count1 = -1;
      int count2 = -1;
      for ( int i = 0 ; i< size; i++)
        arr[i] = in.nextInt();
      int n1 = in.nextInt();
      for ( int i = 0; i < size; i++)
      {
        if (arr[i] == n1)
        {
          System.out.println(i);
          count1 = count1 + 1;
          break;
        }
      }
      if (count1 == -1 )
        System.out.println(count1);
       int n2 = in.nextInt();
      for ( int i = 0; i < size; i++)
      {
        if (arr[i] == n2)
        {
          System.out.println(i);
          count2 = count2 + 1;
          break;
        }
      }
      if (count2 == -1)
        System.out.println(count2);
      }
}