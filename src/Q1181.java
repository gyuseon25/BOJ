import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] a = new String[num];
        for (int i = 0; i < num; i++) {
            a[i] = br.readLine();
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(a));

        String[] ad = linkedHashSet.toArray(new String[]{}); // 배열 > hashset > 배열로 중복제거, 다른 방법도 해보기!
    //버블정렬 구현부
        for (int i = ad.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ad[j].length() > ad[j + 1].length()) {
                    String temp = ad[j + 1];
                    ad[j + 1] = ad[j];
                    ad[j] = temp;
                } else if (ad[j].length() == ad[j + 1].length()) {
                    if (ad[j].compareTo(ad[j + 1]) > 0) {
                        String temp = ad[j + 1];
                        ad[j + 1] = ad[j];
                        ad[j] = temp;
                    }
                }
            }
        }
        for (String s : ad) {
            System.out.println(s);
        }
    }
}
