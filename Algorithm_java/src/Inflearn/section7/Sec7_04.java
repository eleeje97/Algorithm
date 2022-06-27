package Inflearn.section7;

/**
 * 피보나치 수열 (메모이제이션)
 * 재귀보다는 for문이 효율이 좋다. -> 스택프레임이 계속해서 생기기 때문에 메모리 낭비
 */
public class Sec7_04 {
    static int[] fibo;

    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n+1];
        //dfs(n);
        for (int i = 1; i < n; i++) {
            System.out.print(dfs(i) + " ");
        }
    }

    public static int dfs(int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n==1) return fibo[n] = 1;
        else if (n==2) return fibo[n] = 1;
        else return fibo[n] = dfs(n-1) + dfs(n-2);
    }
}
