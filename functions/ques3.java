package functions;

import java.util.Scanner;

//Write a function which takes in 2 numbers and returns the greater of those two.
public class ques3 {
    public static int  GreaterNum(int a, int b)
    {
      int greater;
      if(a>b){
        greater = a;
      }
      else{
        greater= b;
      }
      return greater;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int greater = GreaterNum(a,b);
        System.out.print("the greater no. is:");
        System.out.println(greater);
    }
}
