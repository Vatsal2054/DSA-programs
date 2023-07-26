import java.util.Scanner;

public class dutch_flag {
    public static void main(String[] args) {
        try (Scanner S = new Scanner(System.in)) {
            System.out.print("\nEnter array elements: ");
            int n = S.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = S.nextInt();
            }
            dutch_flag_sort(arr , n);
        }
    }

    private static void dutch_flag_sort(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;
        int temp = 0;
        while(mid <= high) {
            if(mid > high)
                break;
            else if(arr[mid] == 0)
            {
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                temp = 0;
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else if(arr[mid] == 2)
            {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                temp = 0;
                high--;
            }
        }
        System.out.print("\nSorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThis program was prepared by 22CE006.\n");
    }
}
