import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int str_len = sb.length();
    StringBuilder temp = new StringBuilder("");
    int front = 0;
    int end = str_len-1;
    int count = 0;
    for ( int i = 0; i < str_len/2; i++)
    {
      if (front < end)
      {
      char ch1= sb.charAt(front);
      char ch2 = sb.charAt(end);
      if (ch1 == ch2)
        count++;
      }
    }
    if (count == str_len/2)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}