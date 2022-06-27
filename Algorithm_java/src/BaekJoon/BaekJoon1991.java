package BaekJoon;

import java.util.Scanner;

public class BaekJoon1991 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node((char)(i+65));
        }

        for (int i = 0; i < n; i++) {
            char[] tmp = scn.nextLine().replace(" ", "").toCharArray();
            nodes[tmp[0]-65].left = tmp[1] == '.' ? null : nodes[tmp[1]-65];
            nodes[tmp[0]-65].right = tmp[2] == '.' ? null : nodes[tmp[2]-65];
        }

        preoreder(nodes[0]);
        System.out.println();
        inoreder(nodes[0]);
        System.out.println();
        postoreder(nodes[0]);
    }



    public static void preoreder(Node root) {
        if (root != null) {
            System.out.print(root.data);
            preoreder(root.left);
            preoreder(root.right);
        }
    }

    public static void inoreder(Node root) {
        if (root != null) {
            inoreder(root.left);
            System.out.print(root.data);
            inoreder(root.right);
        }
    }

    public static void postoreder(Node root) {
        if (root != null) {
            postoreder(root.left);
            postoreder(root.right);
            System.out.print(root.data);
        }
    }
}

class Node {
    char data;
    Node left;
    Node right;

    public Node (char data) {
        this.data = data;
    }
}
