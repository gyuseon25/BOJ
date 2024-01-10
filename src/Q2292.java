import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result;
        int num = Integer.parseInt(br.readLine());
        int n = 1, index = 0;
        while (true) {
            n = n + (6 * index);
            if (num <= n) {
                result = index + 1;
                break;
            }
            index++;
        }
        System.out.print(result);
    }
}
