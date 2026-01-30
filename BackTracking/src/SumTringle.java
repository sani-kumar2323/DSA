

import java.util.Scanner;

public class SumTringle {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n ;
       n = sc.nextInt();
       int matrix[][] = new int[n][n];
       for(int i = 0; i< n; i++){
           for(int j = 0; j< n; j++){
               matrix[i][j] = sc.nextInt();
           }
       }
       triangleSum(matrix, n);
    }
    public static void triangleSum(int[][] matrix, int n){
        int lower = 0;
        int upper = 0;
        for(int i = 0; i < n; i++){
          for(int j = 0; j < n; j++){
              if(i<=j){
                  lower += matrix[i][j];
              }
              if(i>=j){
                  upper += matrix[i][j];
              }
          }
        }
        System.out.print(upper+ " " + lower);
    }
}
