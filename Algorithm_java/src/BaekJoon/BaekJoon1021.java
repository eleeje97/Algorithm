package BaekJoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon1021 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // 큐의 크기
        int m = scn.nextInt(); // 뽑아내려고 하는 수의 개수
        int[] indexes = new int[m];
        for (int i = 0; i < m; i++) {
            indexes[i] = scn.nextInt();
        }


        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }

        int count = 0;
        int current = 0;
        for (int i = 0; i < m; i++) {
            while (list.get(current) != indexes[i]) {

            }

            list.remove(current);
        }

    }
}
