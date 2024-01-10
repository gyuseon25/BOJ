import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(al);
        for (int n : al)
            sb.append(n).append("\n");
        System.out.println(sb);
    }
}

