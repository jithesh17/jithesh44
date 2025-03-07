public class MiddleCharacterApp {
    public static void main(String[] args) {
        // Built-in string (No user input)
        String input = "Cricket";  // Change this value as needed

        // Display input and middle character(s)
        System.out.println("Input String: " + input);
        System.out.println("Middle character(s): " + getMiddleCharacter(input));
    }

    // Method to get the middle character(s) of a string
    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            // If even length, return two middle characters
            return str.charAt(middle - 1) + "" + str.charAt(middle);
        } else {
            // If odd length, return the single middle character
            return String.valueOf(str.charAt(middle));
        }
    }
}
