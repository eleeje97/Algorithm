package Inflearn.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * MST 최소신장트리 - 크루스칼 (그리디 알고리즘)
 */
public class Sec9_07 {
    static int[] unf;

    public static int find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        unf = new int[n+1];
        for (int i = 1; i <= n; i++) unf[i] = i;

        ArrayList<Edge> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            arr.add(new Edge(a, b, c));
        }
        
        int answer = 0;
        int cnt = 0;
        Collections.sort(arr);

        for (Edge e : arr) {
            int fv1 = find(e.v1);
            int fv2 = find(e.v2);

            if (fv1 != fv2) {
                answer += e.cost;
                union(e.v1, e.v2);

                if (cnt == n-1) {
                    break;
                }
            }
        }

        System.out.println(answer);
    }

    static class Edge implements Comparable<Edge> {
        int v1;
        int v2;
        int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge e) {
            return this.cost - e.cost;
        }
    }
}
