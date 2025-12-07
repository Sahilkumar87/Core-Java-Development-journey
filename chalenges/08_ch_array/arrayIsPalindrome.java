public class arrayIsPalindrome {
    public static void main(String[] args) {
        greet();
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if(isPalin){
            System.out.println("your number is palindrome");
        } 
        else{
            System.out.println("your number is not palindrome");
        }
         
    }


    public static boolean isPalindrome(int[] num){
        int i = 0;
        while(i < num.length / 2){
            if(num[i] != num[num.length-1-i]){
                return false;
            }
            i++;
        }
        return true;
    }



    public static void greet(){
        System.out.println("Welcome to Array is Palindrome\n");
    }
}
