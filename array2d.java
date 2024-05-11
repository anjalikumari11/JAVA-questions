import java.util.Scanner;

public class array2d {
    //print 2d array 
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no. of rows: ");
      int row = sc.nextInt();
      System.out.println("Enter no. of column: ");
      int col = sc.nextInt();

      int [][] numbers = new int[row][col];
      //input
      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
           numbers[i][j] = sc.nextInt();
        }
      }

      // output
      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.print(numbers[i][j] + " ");
        }
        System.out.println();
      }
    }
}
 