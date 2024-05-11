import java.util.Scanner;

public class switchs {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int button = sc.nextInt();
        // if(button==1){
        //     System.out.println("Hello!");
        // }
        // else if(button == 2){
        //  System.out.println("Namaste");
        // }
        // else{
        //     System.out.println("hola");
        // }

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2: 
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Hola");
                break;
            default:
            System.out.println("Enter valid number");
                break;
        }
    }
}
