import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int num = Integer.parseInt(s);

        if (num <=100 && num>=90)
            System.out.println('A');
        else if (num>=80)
            System.out.println('B');
        else if (num>=70)
            System.out.println('C');
        else if (num>=60)
            System.out.println('D');
        else
            System.out.println('F');

    }
}
