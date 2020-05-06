import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int sum=n%10;
      while (temp >= 10)
      {
        temp = temp/10;
        sum = sum + (temp % 10);
      }
      System.out.println(sum);
	}
}