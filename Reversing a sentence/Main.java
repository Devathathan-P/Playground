import java.util.regex.Pattern;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      Pattern p = Pattern.compile("\\s");
      String[] temp = p.split(str);
      String rev = "";
      for (int i = 0; i < temp.length; i++) {
         if (i == temp.length - 1)
            rev = temp[i] + rev;
         else
            rev = " " + temp[i] + rev;
      }
      System.out.println(rev);
   }
}