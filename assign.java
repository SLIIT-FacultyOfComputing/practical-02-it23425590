import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: String Concatenation
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        
        System.out.println("Enter your middle name:");
        String middleName = scanner.nextLine();
        
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        
        // Concatenate full name in the format: "Last Name, First Name Middle Name"
        String fullName = lastName + ", " + firstName + " " + middleName;
        System.out.println("Full name: " + fullName);

        // Part 2: String Comparison
        System.out.println("Enter another full name:");
        String newFullName = scanner.nextLine();
        
        // Compare the new full name with the previous full name (case-insensitive)
        if (fullName.equalsIgnoreCase(newFullName)) {
            System.out.println("The names are the same.");
        } else {
            System.out.println("The names are different.");
        }

        // Part 3: String Modification
        String modifiedName = fullName.replace('a', '@').replace('e', '3');
        modifiedName = modifiedName.toUpperCase();
        System.out.println("Modified full name: " + modifiedName);

        // Part 4: String Splitting
        String[] nameParts = fullName.split(", | ");
        System.out.println("Last Name: " + nameParts[0]);
        System.out.println("First Name: " + nameParts[1]);
        System.out.println("Middle Name: " + nameParts[2]);

        // Part 5: String Trimming
        System.out.println("Enter a string with leading and trailing spaces:");
        String stringWithSpaces = scanner.nextLine();
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed string: " + trimmedString);

        // Part 6: Additional Manipulations
        int vowelCount = countVowels(fullName);
        System.out.println("Number of vowels in the full name: " + vowelCount);

        scanner.close();
    }

    // Method to count vowels in a string
    private static int countVowels(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (char c : lowerStr.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}