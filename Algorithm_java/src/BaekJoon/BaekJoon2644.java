package BaekJoon;

import java.util.*;

public class BaekJoon2644 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        int m = scn.nextInt();

        Node[] nodes = new Node[n+1];
        for (int i = 0; i < n+1; i++) {
            nodes[i] = new Node(i);
        }

        for (int i = 0; i < m; i++) {
            int p = scn.nextInt();
            int c = scn.nextInt();
            nodes[c].parent = nodes[p];
        }

        ArrayList<Integer> parents_a = new ArrayList<>();
        Node node_a = nodes[a];
        parents_a.add(node_a.data);
        while (node_a.parent != null) {
            parents_a.add(node_a.parent.data);
            node_a = node_a.parent;
        }

        ArrayList<Integer> parents_b = new ArrayList<>();
        Node node_b = nodes[b];
        parents_b.add(node_b.data);
        while (node_b.parent != null) {
            parents_b.add(node_b.parent.data);
            node_b = node_b.parent;
        }

        int answer = 0;
        for (int i = 0; i < parents_a.size(); i++) {
            if (parents_b.contains(parents_a.get(i))) {
                answer += parents_b.indexOf(parents_a.get(i));
                break;
            } else {
                answer++;
            }

            if (i == parents_a.size()-1) {
                answer = -1;
            }
        }
        System.out.println(answer);
    }

    static class Node {
        int data;
        Node parent = null;

        public Node(int data) {
            this.data = data;
        }
    }
}
