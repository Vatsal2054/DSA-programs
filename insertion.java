import java.util.Scanner;

class insertion{
    public static void main(String[] args){
        int N;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter elements of array:");
            N = sc.nextInt();
            //N = N - 1;
            int[] A = new int[N];
            System.out.println("Enter elements:");
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            b_sort((N) , A);
            System.out.println("\nThis program was prepared by 22CE006.");
        }
    }

    private static void b_sort(int N, int[] a) {
        int key , j;
        int count = 0;
        for (int i = 1; i < N; i++) {
            key = a[i];
            j = i - 1;
            while((j > (-1)) && (a[j] > key))
            {
                a[j+1] = a[j];
                j = j - 1;
                count++;
            }
            a[j+1] = key;
        }
        System.out.print("The sorted array is: ");
        for (int k = 0; k < N; k++) {
            System.out.print(a[k]+" ");
        }
        System.out.println("Operations carried out:" + count);
    }
}