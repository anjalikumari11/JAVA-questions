package functions;
//Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class ques1 {

    public static int AverageNum(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = AverageNum(a,b,c);
        System.out.println(avg);
    }
}
