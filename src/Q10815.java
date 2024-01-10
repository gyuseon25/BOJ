import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array;
        int num1, num2;
        boolean contain;
        StringTokenizer st;
        num1 = Integer.parseInt(br.readLine());
        array = new int[num1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num1; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array); // 이진탐색을 위해 정렬 필요!

        num2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num2; i++) {
            int temp = Integer.parseInt(st.nextToken());
            int result = binarySearch(array, num1, temp);
            System.out.print(result + " ");
        }
    }

    public static int binarySearch(int[] cards, int N, int search) { // 시간초과 때문에 이진탐색 사용, 이진탐색 전 배열은 정렬 필요!
        int first = 0;
        int last = N - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2; // 중간 인덱스

            if (cards[mid] == search) { // 중간값과 찾으려는 수가 같은 경우
                return 1;
            }

            if (cards[mid] < search) { // 중간값이 찾으려는 수보다 작으면, 그 이하로는 볼 필요 없음.
                first = mid + 1;
            } else { // 중간값이 찾으려는 수보다 크면, 그 이상으로는 볼 필요 없음.
                last = mid - 1;
            }
        }

        return 0;
    }

}
