package Inflearn.section2;

import java.util.*;

public class Sec2_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int[] score = new int[num];
        for (int i = 0; i < num; i++) {
            score[i] = scn.nextInt();
        }

        for (int grade : solution(num, score)) {
            System.out.print(grade +" ");
        }

    }
    
    public static int[] solution(int num, int[] score) {
        int[] answer = new int[num];

        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Number number = new Number(score[i], i);
            numbers.add(number);
        }

        Collections.sort(numbers, new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                if (o1.num <= o2.num) return 1;
                else return -1;
            }
        });


        int grade = 1;
        int tempNum = numbers.get(0).num;
        for (int i = 1; i <= numbers.size(); i++) {
            if (numbers.get(i-1).num == tempNum) {
                numbers.get(i-1).grade = grade;
            } else {
                numbers.get(i-1).grade = i;
                grade = i;
                tempNum = numbers.get(i-1).num;
            }
        }

        Collections.sort(numbers, new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                if (o1.index > o2.index) return 1;
                else return -1;
            }
        });

        for (int i = 0; i < num; i++) {
            answer[i] = numbers.get(i).grade;
        }

        return answer;
    }

    static class Number {
        int num;
        int index;
        int grade;

        Number(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }
}
