import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int column_size = in.nextInt();
    int matrix[][] = new int[row_size][column_size];
    for ( int i = 0 ; i < row_size ; i++ )
    {
      for ( int j = 0 ; j < column_size ; j++ )
        matrix[i][j] = in.nextInt();
    }
    for (int i = 0 ; i < column_size ; i++ )
    {
      for ( int j = 0 ; j < row_size ; j++ )
        System.out.print(matrix[j][i] + " " );
      System.out.println();
    }
  }
}