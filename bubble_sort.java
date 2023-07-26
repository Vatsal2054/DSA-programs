import java.util.Scanner;
class bubble_sort{
    public static void main(String[] args){
        int N;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter elements of array:");
            N = sc.nextInt();
            //N = N - 1;
            int[] A = new int[N];
            System.out.println("Enter elements:");
            for (int i = 0; i <= N-1; i++) {
                A[i] = sc.nextInt();
            }
            b_sort((N-1) , A);
            System.out.println("This program was made by 22CE006.");
        }
    }

    private static void b_sort(int n, int a[]) {
        int exch = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    exch += 1;
                }
            }
        }
        if(exch == 0)
        {
            System.out.println("Array is already sorted.");
        }
        else if(exch > 0)
        {
            System.out.println("Sorted array is:");
            for (int i = 0; i <= n; i++) {
            System.out.println(a[i]);
            }
        }
    }
}

