package BaekJoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon11650 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Dot> dots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dots.add(new Dot(scn.nextInt(), scn.nextInt()));
        }

        dots.sort(new Comparator<Dot>() {
            @Override
            public int compare(Dot o1, Dot o2) {
                if (o1.x > o2.x) {
                    return 1;
                } else if (o1.x < o2.x) {
                    return -1;
                } else {
                    if (o1.y > o2.y) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        });

        for (Dot d : dots) {
            System.out.println(d.x + " " + d.y);
        }
    }

    static class Dot {
        int x;
        int y;

        public Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
