public class mergeSortedArray {
    public static void main(String[] args) {
        // two pointer approach
        greet();
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergeArr = merge(arr1, arr2);
        System.out.println("your merge array is: ");
        ArrayUtility.displayArray(mergeArr);


    }

    public static int[] merge(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length || j < arr2.length){
            if(j == arr2.length || 
                (i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr2[i];
                i++;
                k++;

            }
            else{
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }

        return newArr;

    }
    public static void greet(){
        System.out.println("Welcome to merge Two Array\n");
    }
}
