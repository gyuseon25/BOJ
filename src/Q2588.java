import java.io.*;
public class Q2588 {
    public static void main(String[] args) throws IOException {
        int num1,num2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());

        System.out.println(num1 * (num2%10));
        System.out.println(num1 * ((num2%100 - num2%10)/10));
        System.out.println(num1 * ((num2 - num2%100)/100));
        System.out.println(num1 * num2);
    }
}
