import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Q9012 {
    public static String vps(String s) {
        int lcount = 1, rcount = 0;
        if (s.length() % 2 == 1) {
            return "NO\n";
        } else if (s.charAt(0) == ')') {
            return "NO\n";
        } else {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == '(')
                    lcount++;
                else if (s.charAt(i) == ')') {
                    if (lcount <= rcount) {
                        return "NO\n";
                    }
                    rcount++;
                }
            }
            if (lcount != rcount)
                return "NO\n";
            else
                return "YES\n";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            sb.append(vps(str));
        }
        System.out.println(sb.toString());
    }
}
