import java.util.Scanner;

public class CustomRandom {
    private long seed;

    public CustomRandom(long seed) {
        this.seed = seed;
    }

    public int nextInt(int n) {
        seed = (seed * 6364136223846793005L + 1) & 0x7FFFFFFFFFFFFFFFL;
        return (int) (seed % n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the array size (0 to exit): ");
            int size = scanner.nextInt();
            
            if (size <= 0) {
                break;
            }
            
            long customSeed = System.currentTimeMillis();
            CustomRandom customRandom = new CustomRandom(customSeed);

            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i + 1;
            }

            shuffleArray(arr, customRandom);

            System.out.println("Shuffled array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }

    public static void shuffleArray(int[] arr, CustomRandom customRandom) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int j = customRandom.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
