package BaekJoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BaekJoon10814 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            members.add(new Member(scn.nextInt(), scn.next()));
        }

        members.sort(new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if (o1.age >= o2.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        for (Member m : members) {
            System.out.println(m.age + " " + m.name);
        }
    }

    static class Member {
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
