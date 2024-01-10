import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, a, b;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            str1 = br.readLine();
            st = new StringTokenizer(str1, " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.println(a + b);
        }
    }

}
