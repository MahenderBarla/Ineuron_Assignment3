import java.util.Arrays;
public class SortAlpha {
  
        public static void main(String[] args) {
          
            String Str = "Ineuron Hyderabad";
            String  inputStr = Str.toLowerCase();
            String sortedString =sortStringAlpha(inputStr);
    
            System.out.println("Input: " + inputStr);
            System.out.println("Sorted Output: " + sortedString);
        }
    
        public static String sortStringAlpha(String inputStr) {
            
            char[] charArr= inputStr.toCharArray();
    
            Arrays.sort(charArr);
    
            
            return new String(charArr);
        }
    }
