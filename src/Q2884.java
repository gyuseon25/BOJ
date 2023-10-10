import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());
        if (num2 - 45 < 0) {
            if (num1 == 0)
                num1 = 23;
            else
                num1 -= 1;
            num2 = num2 + 60 - 45;
        } else
            num2 -= 45;
        System.out.printf("%d %d", num1, num2);

    }
}
