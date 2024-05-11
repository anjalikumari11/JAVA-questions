import java.util.Scanner;
//Searching for an element x in a matrix.
//  class X{
//     Scanner sc= new Scanner(System.in);
//     int arr[][] =  new int[3][3];
//     int i,j,num;
//          public void input(){
//           for(i=0; i<3; i++){
//             for(j=0; j<3; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//           }
//          public void PrintNum(){
//             for(i=0; i<3; i++){
//                 for(j=0; j<3; j++){
//                     System.out.print(arr[i][j]);
//                 }
//                 System.out.println();
//             }
//          }
//          }
// }

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int i, j, num;
        int key;
       System.out.println("Enter the num in array");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("Thanks");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the num which you want to search?");
        key = sc.nextInt();
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
              if(arr[i][j] == key){
                System.out.println("The key no. is placed on the index: "+i+","+ j);
              }
            }
            System.out.println();
        }
    }
}
