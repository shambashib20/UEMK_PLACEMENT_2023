import java.util.*;

class valid {

    // Function that returns true if str
    // is a valid identifier
    static boolean isValid(String str, int n) {

        // If first character is invalid
        if (!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z')
                || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
                || str.charAt(0) == '_'))
            return false;

        // Traverse the string for the rest of the characters
        for (int i = 1; i < str.length(); i++) {
            if (!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                    || (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                    || str.charAt(i) == '_'))
                return false;
        }

        // String is a valid identifier
        return true;
    }

    // Driver code
    public static void main(String args[]) {
        String str = "_UEM123";
        int n = str.length();

        if (isValid(str, n))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}