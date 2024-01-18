import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1463 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int count = 0;

        while (num != 1) {
            if (num % 3 == 0 && num % 2 == 0) {
                num /= 3;
                count++;
            } else if (num % 3 == 0 && num % 2 == 1) {
                num /= 3;
                count++;
            } else if (num % 3 == 1 && num % 2 == 0) {
                num -= 1;
                count++;
            } else if (num % 3 == 1 && num % 2 == 1) {
                num -= 1;
                count++;
            } else if (num % 3 == 2 && num % 2 == 0) {
                num /= 2;
                count++;
            } else if (num % 3 == 2 && num % 2 == 1) {
                num -= 1;
                count++;
            }
        }
        bw.write(count + "");
        bw.flush();
    }
}
