import java.io.*;
import java.util.StringTokenizer;
public class Q11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num1,num2,num3;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        num1 = Long.parseLong(st.nextToken());
        num2 = Long.parseLong(st.nextToken());
        num3 = Long.parseLong(st.nextToken());
        System.out.println(num1+num2+num3);
    }

}
