package functions;

import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle.
public class ques4 {
    public static float parameter(float r)
    {
        float circumference = 2* (22/7) *r;
        return circumference;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float circumference = parameter(r);
        System.out.print("The circumference of the circle:-");
        System.out.println(circumference);
    }
}
