package BaekJoon;

import java.util.Scanner;

public class BaekJoon1018 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        String[] board = new String[n];

        for (int i = 0; i < n; i++) {
            board[i] = scn.next();
        }

        // 첫번째 칸이 흰색인 경우
        int[][] check_w = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i%2 == 0) {
                    if (j%2 == 0) {
                        if (board[i].charAt(j) == 'B') {
                            check_w[i][j] = 1;
                        }
                    } else {
                        if (board[i].charAt(j) == 'W') {
                            check_w[i][j] = 1;
                        }
                    }
                } else {
                    if (j%2 == 0) {
                        if (board[i].charAt(j) == 'W') {
                            check_w[i][j] = 1;
                        }
                    } else {
                        if (board[i].charAt(j) == 'B') {
                            check_w[i][j] = 1;
                        }
                    }
                }
            }
        }

        // 가장 효율적인 8*8 체스판 선택
        // * 첫번째 데이터
        int min = 0;
        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 8; k++) {
                min += check_w[j][k];
            }
        }

        int sum = 0;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        sum += check_w[k][l];
                    }
                }

                min = Math.min(min, sum);
                min = Math.min(min, 64 - sum);
                sum = 0;
            }
        }

        System.out.println(min);

    }
}
