import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int column_size = in.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    int matrix2[][] = new int[row_size][column_size];
    for ( int i = 0 ; i < row_size ; i++ )
    {
      for ( int j = 0 ; j < column_size ; j++ )
        matrix1[i][j] = in.nextInt();
    }
    for ( int i = 0 ; i < row_size ; i++ )
    {
      for ( int j = 0 ; j < column_size ; j++ )
        matrix2[i][j] = in.nextInt();
    }
    int ans;
    for ( int i = 0 ; i < row_size ; i++ )
    {
      for ( int j = 0 ; j < column_size ; j++ )
      {
        ans = matrix1[i][j] - matrix2[i][j];
        System.out.print(ans + " ");
      }
      System.out.println();
    }
    }
  }