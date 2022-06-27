package Inflearn.section7;

/**
 * 재귀함수
 */
public class Sec7_01 {
    public static void main(String[] args) {
        dfs(5);
    }

    public static void dfs(int n) {
        if (n==0) return;
        else {
            System.out.print(n + " ");
            dfs(n-1);
        }
    }
}
