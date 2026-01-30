

import java.util.Scanner;

public class boundaryTraversal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, m;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i< m; i++){
            for(int j = 0; j < n; j++){
               matrix[i][j] = sc.nextInt();
            }
        }
        boundaryTraversal(matrix,m,n);

    }
    public static void boundaryTraversal(int[][] matrix, int n, int m){
        if(m == 1){
            for(int i = 0; i< n; i++){
                System.out.print(matrix[0][i]);
            }
        }
        if(m == 1){
            for(int i = 0; i< n; i++){
                System.out.print(matrix[0][i]);
            }
        }
        else if(n == 1){
            for(int j =0; j < m; j++){
                System.out.print(matrix[j][0]);
            }
        }
        else{
            for(int j = 0; j < m; j++){
                System.out.print(matrix[0][j]);
            }
            for(int i = 1; i < n; i++){
                System.out.print(matrix[i][m-1]);
            }
            for(int j = m-2; j >= 0; j--){
                System.out.print(matrix[n-1][j]);
            }
            for(int i = n-2; i > 0; i--){
                System.out.print(matrix[i][0]);
            }
        }
    }
}
