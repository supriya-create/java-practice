public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arr1 = {{2,4}, {8,9}};
        int[][] arr2 = {{6,8}, {3,4}};
        int[][] sum = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.println(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
