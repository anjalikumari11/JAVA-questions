import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    switch (num) {
        case 1:
        System.out.println(a+b);
        break;
        case 2:
        System.out.println(a-b);
        break;
        case 3:
        System.out.println(a*b);
        break;
        case 4:
        System.out.println(a/b);
        break;
        default:
         System.out.println("Invalid choice");
    }
    }
}
