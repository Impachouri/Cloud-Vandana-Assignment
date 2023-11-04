import java.util.Scanner;

public class GeneralPangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a sentence (or type 'exit' to quit): ");
            String sentence = scanner.nextLine();

            if (sentence.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types 'exit'
            }

            boolean isPangram = isPangram(sentence);
            System.out.println("Is Pangram: " + isPangram);
        }

        scanner.close();
    }

    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                alphabet[index] = true;
            }
        }

        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}