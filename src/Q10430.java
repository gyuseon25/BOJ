import java.io.*;
import java.util.StringTokenizer;
public class Q10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1,num2,num3;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());
        num3 = Integer.parseInt(st.nextToken());
        System.out.println((num1+num2)%num3);
        System.out.println(((num1%num3)+(num2%num3))%num3);
        System.out.println((num1*num2)%num3);
        System.out.println(((num1%num3)*(num2%num3))%num3);
    }
}
