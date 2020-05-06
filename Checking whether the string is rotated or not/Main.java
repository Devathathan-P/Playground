import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      String con_str = str1 + str1;
      StringBuilder sb = new StringBuilder(str2);
      int count = 0 ;
      for ( int i = 0 ; i < str1.length() ; i++ )
      {
        StringBuilder temp = new StringBuilder("");
        for ( int j = 4 ; j <str1.length()+4; j++)
          temp.append(con_str.charAt(j));
        for ( int k = 0 ; i < str2.length() ; i ++ )
        {
          char ch1 = sb.charAt(k);
          char ch2 = temp.charAt(k);
          if(ch1 == ch2 )
            count++;
        }
        if (count == str2.length())
        {
          System.out.println("Yes");
          break;
        }
      }
      if ( count == 0 )
        System.out.println("No");
    }
}
