package Inflearn.section3;

import java.util.*;

public class Sec3_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scn.nextInt();
        }
        int M = scn.nextInt();
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] = scn.nextInt();
        }


        for (int i : solution(N, M, a, b)) {
            System.out.print(i + " ");
        }

    }

    public static ArrayList<Integer> solution(int N, int M, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0;
        int p2 = 0;

        while (p1 < N && p2 < M) {
            if (a[p1] > b[p2]) {
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                answer.add(a[p1]);
                p1++;
                p2++;
            }
        }

        return answer;
    }
}
