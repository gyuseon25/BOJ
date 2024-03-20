package DataStructure.SectionSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11659Refactoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int dnum = Integer.parseInt(st.nextToken());
        int qnum = Integer.parseInt(st.nextToken());

        long[] s = new long[dnum + 1];

        str = br.readLine();
        st = new StringTokenizer(str);

        for (int i = 1; i < dnum + 1; i++) {
            s[i] = s[i - 1] + Long.parseLong(st.nextToken());
        }

        for (int i = 0; i < qnum; i++) {
            str = br.readLine();
            st = new StringTokenizer(str);
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            System.out.println(s[second] - s[first - 1]);
        }
    }
}
