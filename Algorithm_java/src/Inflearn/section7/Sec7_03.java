package Inflearn.section7;

/**
 * 팩토리얼
 */
public class Sec7_03 {
    public static void main(String[] args) {
        System.out.println(dfs(5));
    }

    public static int dfs(int n) {
        if (n==1) return 1;
        else return n * dfs(n-1);
    }
}
