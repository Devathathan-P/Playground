import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int arr[] = new int[26];
    int offset = 0 ;
    for (int i = 0 ; i < str.length() ; i++ )
    {
      char ch = str.charAt(i);
      if ( ch >= 'a' && ch <= 'z' )
        offset = ch - 'a';
      else if ( ch >= 'A' && ch <= 'A' )
        offset = ch - 'A';
      arr[offset] = arr[offset] + 1;
    }
    for ( int i = 0; i < str.length(); i++ ) 
    {
      char ch = str.charAt(i);
      if ( ch >= 'a' && ch <= 'z' )
        offset = ch - 'a';
      else if ( ch >= 'A' && ch <= 'A' )
        offset = ch - 'A';
      if ( arr[offset] != 0 )
      {
        System.out.print((char)(offset + 'a'));
        System.out.print(arr[offset]);
        System.out.print(" ");
        arr[offset] = arr[offset] - arr[offset];
      }
    }
  }
}