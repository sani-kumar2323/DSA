

import java.util.Scanner;

public class TransposeMatrix {
     static int matrixTranspose(int[][] matrix, int n){
        int transpose[][] = new int[n][n];
        for(int r =0; r < n; r++){
            for(int c = 0; c< n; c++){
                transpose[c][r] = matrix[r][c];
            }
        }
        return transpose;
    }
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int n;
       n = sc.nextInt();
       int[][] matrix = new int[n][n];
       for(int i = 0; i< n; i++){
           for(int j = 0; j< n; j++){
               matrix[i][j] = sc.nextInt();
           }
       }

       int ans[][] = new int[n][n];
       ans = matrixTranspose(matrix,n);
      for(int i = 0; i<n; i++){
          for(int j = 0; j < n; j++){
              System.out.print(ans[i][j]);
          }
          System.out.println();
      }
    }
}

