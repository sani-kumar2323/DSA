public class Array {
    public static void main(String[]args){
        int arr[][] = {{1,2,3}, {4,5,6},{7,8,9},{10,11,12,13}};
        int rows = arr.length;
        int cols = arr[0].length;
        for(int r = 0; r < rows; r++){
            for(int c =0; c < cols; c++){
                System.out.print(+arr[r][c]+" ");

            }
            System.out.println();
        }
    }
}
