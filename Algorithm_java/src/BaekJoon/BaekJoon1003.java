package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1003 {
    static int[][] count = new int[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        count[0][0] = 1;
        count[1][1] = 1;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(bf.readLine());

            System.out.print(fibonacci(num)[0] + " " + fibonacci(num)[1] + "\n");
        }
    }

    public static int[] fibonacci(int n) {
        if (count[n][0] == 0 && count[n][1] == 0) {
            count[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            count[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        }

        return count[n];
    }
}
