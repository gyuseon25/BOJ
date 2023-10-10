import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = 0, num2 = 0;
        String str1 = br.readLine();
        num1 = Integer.parseInt(str1);
        str1 = br.readLine();
        num2 = Integer.parseInt(str1);

        if (num1 > 0 && num2 > 0)
            System.out.println("1");
        else if (num1 > 0 && num2 < 0)
            System.out.println("4");
        else if (num1 < 0 && num2 > 0)
            System.out.println("2");
        else if (num1 < 0 && num2 < 0)
            System.out.println("3");

    }
}
