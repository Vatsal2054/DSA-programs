import java.util.Arrays;
import java.util.Scanner;

public class Sticks {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\n\nEnter the number of elements in array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for( int i=0 ; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            // Arrays.toString(arr);
            Arrays.sort(arr);
            arr = reverse(arr);
            for( int i=0 ; i<n; i++)
            {
                System.out.print(arr[i] + " ");
            }
            int[] rect = new int[2];
            int cnt = 0;
            for (int i=0 ; i < n-1; i++) {
                if(arr[i] == arr[(i+1)])
                {
                    rect[cnt] = arr[i];
                    cnt++;
                    if(cnt == 2)
                    {
                        break;
                    }
                }
            }
            System.out.println("\n\nThe maximum area of rectangle is:" + (rect[0]*rect[1]) + "\n");
            System.out.println("This program was prepared by 22CE006.\n");
        }
    }

    private static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i] = arr[(n - 1) - i];
            }
        }
        return temp;
    }
}
