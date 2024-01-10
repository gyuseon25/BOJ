import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = 10001;
        if (s.charAt(0) == 'x')
            result = 1;
        else if (s.charAt(2) == 'x') {
            if (s.charAt(1) == '+')
                result = 1;
            else if (s.charAt(1) == '-')
                result = -1;
        } else if (s.charAt(0) == '-' && s.charAt(1) == 'x')
            result = -1;
        else if (s.indexOf('x') == -1)
            result = 0;
        if (result != 10001) {
            System.out.println(result);
            return;
        }
        int x = s.indexOf('x');
        String ans = "";
        for (int i = x - 1; i >= 0; i--) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                ans = s.charAt(i) + ans;
                break;
            }
            ans = s.charAt(i) + ans;
        }
        System.out.println(ans);


    }
} //이 풀이는 런타임 에러 StringIndexOutOfBouds뜸
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str1 = br.readLine();
//        int result = 10001;
//        if (str1.charAt(0) == 'x')
//            result = 1;
//        else if (str1.charAt(0) == '-' && str1.charAt(1) == 'x')
//            result = -1;
//        else if (str1.indexOf('x') == -1)
//            result = 0;
//
//        if (result != 10001) {
//            System.out.println(result);
//            return;
//        }
//
//        int x = str1.indexOf('x');
//        String ans = "";
//        for (int i = x - 1; i >= 0; i--) {
//            if (str1.charAt(i) == '+' || str1.charAt(i) == '-') {
//                ans = str1.charAt(i) + ans;
//                break;
//            }
//            ans = str1.charAt(i) + ans;
//        }
//        System.out.println(ans);
//
//    }오류 안나는 풀이