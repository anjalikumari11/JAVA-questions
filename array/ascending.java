package array;
//Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.Scanner;

public class ascending {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array.");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the numbers in array.");
        for(int i= 0; i<size; i++){
           a[i] = sc.nextInt();
        }
        System.out.println("Thanks");
        for(int i= 0; i<a.length; i++){
        int temp=0;
            for(int j= i+1; j < a.length; j++){
                if(a[i]> a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i] + " ");

             }
        
    }
}
