package Day7;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = in.nextInt();
            }
        }
         for(int i= 0; i <r; i++){
             int s=0;
             for(int j=0;j<c;j++){
            
           s+=arr[j][i];
        }
        System.out.println(s);
        
}
  in.close();
    }
}
