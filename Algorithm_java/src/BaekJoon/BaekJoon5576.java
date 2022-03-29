package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaekJoon5576 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> W_scores = new ArrayList();
        ArrayList<Integer> K_scores = new ArrayList();

        for (int i = 0; i < 10; i++) {
            W_scores.add(scn.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            K_scores.add(scn.nextInt());
        }

        Collections.sort(W_scores);
        Collections.sort(K_scores);

        System.out.print(W_scores.get(7)+W_scores.get(8)+W_scores.get(9)+" ");
        System.out.print(K_scores.get(7)+K_scores.get(8)+K_scores.get(9));
    }
}
