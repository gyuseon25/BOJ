import java.io.*;
import java.util.StringTokenizer;
public class Q1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double num1,num2;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        num1 = Double.parseDouble(st.nextToken());
        num2 = Double.parseDouble(st.nextToken());
        System.out.println(num1/num2);
    }
}
