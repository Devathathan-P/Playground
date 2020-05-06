import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
      int n=in.nextInt();
    int fd=n/100;
    int sd=((n%100)-(n%10))/10;
    int ld=n%10;
    System.out.print(ld);
    System.out.print(sd);
    System.out.print(fd);
  }
}