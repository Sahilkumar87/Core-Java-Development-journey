public class reverseArray {
    public static void main(String[] args) {
        greet();
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("your reversed array is");
        ArrayUtility.displayArray(numArr);
    }

    public static void reverse(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length -1) -i];
            arr[(arr.length-1) - i] = swap;
            i++;
        }
    }

    public static void greet(){
        System.out.println("Welcome to Array Reverse\n");
    }
}
