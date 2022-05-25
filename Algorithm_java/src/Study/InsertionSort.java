package Study;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int current = i;
            for (int j = 1; j < i+1; j++) {
                if (arr[current] < arr[i-j]) {
                    int tmp = arr[current];
                    arr[current] = arr[i-j];
                    arr[i-j] = tmp;
                    current = i-j;
                } else {
                    break;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
