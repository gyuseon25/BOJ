import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2, num3, price = 0;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());
        num3 = Integer.parseInt(st.nextToken());

        if (num1 == num2 && num2 == num3 && num3 == num1)
            price = 10000 + num1 * 1000;
        else if (num1 == num2 && num1 != num3)
            price = 1000 + num1 * 100;
        else if (num2 == num3 && num2 != num1)
            price = 1000 + num2 * 100;
        else if (num3 == num1 && num3 != num2)
            price = 1000 + num3 * 100;
        else if (num1 != num2 && num2 != num3 && num3 != num1) {
            int max = 0;
            if (num1 > max) max = num1;
            if (num2 > max) max = num2;
            if (num3 > max) max = num3;
            price = max * 100;
        }
        System.out.print(price);
    }
}
