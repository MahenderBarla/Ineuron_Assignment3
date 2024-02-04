public class Specialchar {
    
        public static void main(String[] args) {
           
            String inputSt = "Hello!  @World#123";
            int specialChar = countSpecialChar(inputSt);
    
            System.out.println("Input String: " + inputSt);
            System.out.println("Number of Special Characters: " + specialChar);
        }
    
        public static int countSpecialChar(String inputStr) {
            int count = 0;
    
            for (int i = 0; i < inputStr.length(); i++) {
                char ch = inputStr.charAt(i);
                
                if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                    count++;
                }
            }
    
            return count;
        }
    }
    

