public class multidimensionalArray {
    public static void main(String[] args) {
        int[][] myArr = new int[2][3];
        myArr[0][1] = 1;
        int[][] arr = {{1, 3, 5}, {2, 6}, {9, 10, 11}};
        System.out.println("lenght of array = " + arr.length);
        //System.out.println(arr[1][2]);

        
        // 2D array
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
