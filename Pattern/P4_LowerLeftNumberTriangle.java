// 4.  1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5


import java.util.Scanner;

public class P4_LowerLeftNumberTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the value of row and column: ");
        int n = sc.nextInt();

        sc.close();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }



    }
}