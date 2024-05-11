package array;

import java.util.Scanner;

//Find the maximum & minimum number in an array of integers. 
public class array2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array.");
        int size = sc.nextInt();
        int a [] = new int[size];
        //input
        System.out.println("Enter the no.");
        for(int i= 0; i<size; i++){
            a[i] = sc.nextInt();
        }   
        System.out.println("thanks");
        int min = a[0];
        int max = a[0];
       

        for(int i = 0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }

            if(a[i]> max)
            {
                max = a[i];
            }
            
           }
           System.out.println("Max no. is: "+ max);
           System.out.print("Minimum no. is: "+min);
    
    }
      
}
