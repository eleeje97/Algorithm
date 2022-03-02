package Inflearn.section3;

import java.util.*;

public class Sec3_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int N = scn.nextInt();
        for (int i = 0; i < N; i++) {
            array.add(scn.nextInt());
        }
        int M = scn.nextInt();
        for (int i = 0; i < M; i++) {
            array.add(scn.nextInt());
        }

        Collections.sort(array);

        for (int e : array) {
            System.out.print(e + " ");
        }

    }
}
