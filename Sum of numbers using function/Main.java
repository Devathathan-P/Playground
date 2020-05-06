import java.util.Scanner;
class Main{
  public static  int sum ( int a )
  {
    int sum = 0;
    for ( int i =1; i <= a; i++)
      sum = sum+i;
    System.out.println(sum);
    return 0;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      sum(n);
	}
}