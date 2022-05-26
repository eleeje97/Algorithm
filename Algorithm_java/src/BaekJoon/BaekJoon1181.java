package BaekJoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon1181 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = scn.next();
            if (!words.contains(temp)) {
                words.add(temp);
            }
        }
        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    if (o1.compareTo(o2) > 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        });

        for (String s : words) {
            System.out.println(s);
        }
    }
}
