import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k, q, l, b, n, p;
        int bk = 1;
        int bq = 1;
        int bl = 2;
        int bb = 2;
        int bn = 2;
        int bp = 8;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");

        k = bk - Integer.parseInt(st.nextToken());
        q = bq - Integer.parseInt(st.nextToken());
        l = bl - Integer.parseInt(st.nextToken());
        b = bb - Integer.parseInt(st.nextToken());
        n = bn - Integer.parseInt(st.nextToken());
        p = bp - Integer.parseInt(st.nextToken());

        System.out.printf("%d %d %d %d %d %d", k, q, l, b, n, p);

    }
}
