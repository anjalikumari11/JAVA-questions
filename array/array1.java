package array;

import java.util.Scanner;

//Take an array of names as input from the user and print them on the screen
public class array1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the number of name you want to enter!");
       String names [] = new String[size];
       for(int i=0; i<size; i++){
        names[i] = sc.next();
       }

       for(int i=0; i<size; i++){
        System.out.print(names[i]);
       }

       
    }
}
