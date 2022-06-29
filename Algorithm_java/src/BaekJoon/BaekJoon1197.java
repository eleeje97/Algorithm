package BaekJoon;

import java.util.*;

public class BaekJoon1197 {
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
        int v = scn.nextInt();
        int e = scn.nextInt();

        unf = new int[v+1];
        for (int i = 1; i <= v; i++) unf[i] = i;

        ArrayList<Edge> arr = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            arr.add(new Edge(a, b, c));
        }

        int answer = 0;
        int cnt = 0;
        Collections.sort(arr);

        for (Edge edge : arr) {
            int fv1 = find(edge.v1);
            int fv2 = find(edge.v2);

            if (fv1 != fv2) {
                answer += edge.cost;
                union(edge.v1, edge.v2);

                if (cnt == v-1) {
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
