import java.util.Scanner;

public class functons {
    //Add two number
//    public static int Sum(int a, int b){
//     int Sum = a+b;
//     return Sum;
//    }

//multipy two number
// public static int Multipy(int a, int b){
//     int mul= a*b;
//     return mul;
// }

// factorial 
public static int FactorialNum(int a){
    if(a<0){
        System.out.println("invalid number");
    }
    int fact=1;
    for(int i=a; i>=1; i--){
      fact = fact*i;
    }
    return fact;
}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // int total= Sum(a,b);
        // int mul = Multipy(a, b);
        // System.out.println(mul);
        System.out.println(FactorialNum(a));
    }
}
