/*
        1 2 3 4 5
        1 2 3 4 
        1 2 3
        1 2
        1
 */

 import java.util.Scanner;

 public class P8_UpperLeftNumberTriangle {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 }