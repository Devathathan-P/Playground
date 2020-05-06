import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    int key = in.nextInt();
    if ( ch >= 'a' && ch <='z' )
    {
      int offset = ch - 'a';
      if ( offset >= key )
      {
        offset = (offset - key) % 26;
        ch = (char)(offset + 'a');
      }
      else
      {
        offset = (123 + (offset - key)) ;
        ch = (char) (offset);
      }
    }
    else if ( ch >= 'A' && ch <='Z' )
    {
      int offset = ch - 'A';
      if ( offset >= key )
      {
        offset = (offset - key) % 26;
        ch = (char)(offset + 'A');
      }
      else
      {
        offset = (91 + (offset - key)) ;
        ch = (char) (offset);
      }
    }
    System.out.println(ch);
    }
  }