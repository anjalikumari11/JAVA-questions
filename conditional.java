import java.util.Scanner;

public class conditional{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // if(age>38){
       //        int age = sc.nextInt();
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }

        // find the given num is odd or even
        // int num = sc.nextInt();
        //  if(num%2==0){
        //     System.out.println("Number is even");
        //  }
        //  else{
        //     System.out.println("Number is odd");
        //  }
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b)
        {
         System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is smaller");
        }
    }
}