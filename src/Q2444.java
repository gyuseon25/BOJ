import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i < 2 * num; i++) {
            int blank = Math.abs(num - i);
            for (int j = 0; j < blank; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (num - blank) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
