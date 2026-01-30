//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
    }
}