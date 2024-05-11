import java.util.Scanner;

class X{
    Scanner sc = new Scanner(System.in);
    int n;
public void input(){
    n = sc.nextInt();

} 
public void sum(){
    int sum = 0; 
    for(int i=0; i<=n; i++){
       sum = sum +i;
    }
    System.out.println(sum);
}   
}
public class NaturalNoSum {
    public static void main(String [] args){
        X ob = new X();
        ob.input();
        ob.sum();
    }
}