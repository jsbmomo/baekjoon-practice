import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1182 {
  static int[] num;
  static int N;
  static int S;
  static int count;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    S = Integer.parseInt(st.nextToken());

    num = new int[N];

    st = new StringTokenizer(br.readLine());

    for (int i = 0; st.hasMoreTokens(); i++) {
      num[i] = Integer.parseInt(st.nextToken());
    }

    solution(0, 0);

    System.out.println(count);
    br.close();
  }

  public static void solution(int index, int sum) {
    if (index == num.length) return;
    if (sum + num[index] == S) count++;

    solution(index + 1, sum + num[index]);
    solution(index + 1, sum);
  }
}
