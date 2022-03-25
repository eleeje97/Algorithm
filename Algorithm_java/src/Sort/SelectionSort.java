package Sort;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int min = i-1;
            for (int j = i; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int tmp = arr[i-1];
            arr[i-1] = arr[min];
            arr[min] = tmp;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
