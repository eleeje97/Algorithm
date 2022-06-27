package Inflearn.section7;

/**
 * 이진수 만들기
 */
public class Sec7_02 {
    public static void main(String[] args) {
        dfs(11);
    }

    public static void dfs(int n) {
        if (n==0) return;
        else {
            dfs(n/2);
            System.out.print(n%2);
        }
    }
}
