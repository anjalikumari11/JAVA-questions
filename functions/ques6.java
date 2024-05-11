package functions;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.Scanner;

public class ques6 {
    // public static int Count(int num) {
    //     int postive = 0;
    //     int negative = 0;
    //     int zero = 0;
    //     if (num > 0) {
    //         postive = postive + 1;
    //     } else if (num < 0) {
    //         negative = negative + 1;
    //     } else { 
    //         zero = zero + 1;
    //     }

    //     return postive;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number you want:");
        int n = sc.nextInt();
        int num;
        for (int i = 1; i <= n; i++) {
            num = sc.nextInt();
            
        }
        // System.out.print(num);
       
    }
}
