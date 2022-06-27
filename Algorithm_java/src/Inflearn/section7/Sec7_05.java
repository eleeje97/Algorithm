package Inflearn.section7;

/**
 * 이진트리 순회 (깊이우선탐색)
 */
public class Sec7_05 {
    public static void main(String[] args) {
        // 트리 생성
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preoreder(root);
        System.out.println();
        inoreder(root);
        System.out.println();
        postoreder(root);

    }

    public static void preoreder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preoreder(root.left);
            preoreder(root.right);
        }
    }

    public static void inoreder(Node root) {
        if (root != null) {
            inoreder(root.left);
            System.out.print(root.data + " ");
            inoreder(root.right);
        }
    }

    public static void postoreder(Node root) {
        if (root != null) {
            postoreder(root.left);
            postoreder(root.right);
            System.out.print(root.data + " ");
        }
    }

}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}