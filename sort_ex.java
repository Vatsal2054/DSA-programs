import java.util.Scanner;

public class sort_ex{
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter elements of array:");
        int n = S1.nextInt();
        int arr[] = new int[n];
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = S1.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0)
                cnt1++;
            else if(arr[i] == 1)
                cnt2++;
            else
                cnt3++;
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < cnt1; i++) {
            System.out.print("0 ");
        }
        for (int j = cnt1; j  < (cnt1 + cnt2); j++) {
            System.out.print("1 ");
        }
        for (int k = (cnt1 + cnt2); k < (cnt1 + cnt2 + cnt3); k++) {
            System.out.print("2 ");
        }
    }
}