import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1463dp {
    static Integer[] dp;

    static int calc(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(calc(n - 1), Math.min(calc(n / 3), calc(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(calc(n / 3), calc(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(calc(n / 2), calc(n - 1)) + 1;
            } else {
                dp[n] = calc(n - 1) + 1;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        dp = new Integer[num + 1];
        dp[0] = dp[1] = 0;

        bw.write(calc(num) + "");
        bw.flush();

    }
}
