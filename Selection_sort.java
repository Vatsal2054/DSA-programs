import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter elements of array:");
            int N = s.nextInt();
            int[] K = new int[N];
            System.out.println("Enter elements:");
            for (int i = 0; i < N ; i++) {
                K[i] = s.nextInt();
            }
            S_sort( N , K );
            System.out.println("\n\nThis program was prepared by 22CE006.");
        }
    }

    private static void S_sort(int n, int k[]) {
        for (int i = 1; i < n; i++)
        {
            int key = k[i];
            int j = i - 1;
            while (j >= 0 && k[j] > key)
            {
                k[j + 1] = k[j];
                j = j - 1;
            }
            k[j + 1] = key;
        }
        System.out.print("Sorted Array: ");
    
        for (int i = 0; i < n ; i++) {
            System.out.print(k[i] + " ");
        }
    }
}
