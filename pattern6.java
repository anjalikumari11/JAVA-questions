//butterfly pattern
public class pattern6 {
    public static void main(String [] args)
    {
        //upper half
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            int spaces= 2*(4-i);
            for(int j=1; j<=spaces; j++)
            {
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=4; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            int spaces= 2*(4-i);
            for(int j=1; j<=spaces; j++)
            {
                System.out.print(" ");
            }
            //2nd part
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
