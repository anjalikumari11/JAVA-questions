package array;
//For a given matrix of N x M, print its transpose.

import java.util.Scanner;

public class transpose {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int i, j, num;
        int key;
       System.out.println("Enter the num in array");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("Thanks");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
        

    }
}
