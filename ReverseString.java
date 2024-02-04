import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String inputstr = sc.next();
        String outputStr = reverseString(inputstr);

        System.out.println("Input: " + inputstr);
        System.out.println("Output: " + outputStr);
    }

    public static String reverseString(String inputStr) {
        char[] charArr = inputStr.toCharArray();
        int left = 0;
        int right = charArr.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }

        return new String(charArr);
    }
}
