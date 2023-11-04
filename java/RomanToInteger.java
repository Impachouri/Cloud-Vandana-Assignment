import java.util.Scanner;

public class RomanToIntegerWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String roman;

        while (true) {
            System.out.print("Enter a Roman numeral (or -1 to exit): ");
            roman = scanner.nextLine().toUpperCase(); // Convert input to uppercase
            
            if (roman.equals("-1")) {
                break; // Exit the loop if -1 is entered
            }

            int result = romanToInteger(roman);
            System.out.println("Integer value: " + result);
        }
        
        scanner.close();
    }

    public static int romanToInteger(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            int currentVal = romanValue(roman.charAt(i));
            if (i < roman.length() - 1 && currentVal < romanValue(roman.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;
    }

    public static int romanValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}