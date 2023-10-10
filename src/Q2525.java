import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2, time, hour, min, tmin;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());
        time = Integer.parseInt(br.readLine());
        tmin = 60 * num1 + num2; // 현재 시간을 분으로
        tmin = tmin + time; // 요리시간 더하기

        hour = (tmin / 60) % 24; //24시 이상이 될경우
        min = tmin % 60;

        System.out.printf("%d %d", hour, min);
    }
}
