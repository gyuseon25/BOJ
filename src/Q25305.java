import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q25305 {
public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num, cl;
        String str1 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        num = Integer.parseInt(st.nextToken());
        cl = Integer.parseInt(st.nextToken());
        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        Integer[] grade = new Integer[num];

        for(int i = 0; i<num;i++){
            grade[i] = Integer.parseInt(st2.nextToken());
        }

    Arrays.sort(grade, Collections.reverseOrder());
    System.out.println(grade[cl-1]);

        }

}
