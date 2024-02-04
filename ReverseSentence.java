import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String inputSen = sc.nextLine();

      
        String reversedSen = reverseSentence(inputSen);

       
        System.out.println("Reversed Sentence: " + reversedSen);

      
      
    }

    public static String reverseSentence(String inputSen) {
        
        String[] words = inputSen.split(" ");

       
        StringBuilder reversedSent = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseString(word);
            reversedSent.append(reversedWord).append(" ");
        }

      
        return reversedSent.toString().trim();
    }

    public static String reverseString(String inputStr) {
        char[] charArray = inputStr.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

           
            left++;
            right--;
        }

        return new String(charArray);
    }
}

