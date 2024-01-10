import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total, count, a, b, sum = 0;
        total = Integer.parseInt(br.readLine());
        count = Integer.parseInt(br.readLine());
        String str;
        StringTokenizer st;
        for (int i = 0; i < count; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum += (a * b);
        }
        if (sum == total)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
