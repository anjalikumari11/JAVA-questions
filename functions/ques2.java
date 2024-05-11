package functions;

import java.util.Scanner;

//Write a function to print the sum of all odd numbers from 1 to n.
public class ques2 {
    
    public static int AddOddNum(int n){
        int Sum=0;
        for(int i=1; i<=n;i++){
            if(i%2==0){
                 Sum = Sum + 0;
            }
            else{
                Sum = Sum + i;
            }
        }
        return Sum;

    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum = AddOddNum(n);
        System.out.print("The sum is :");
        System.out.println(Sum);
    }
}
