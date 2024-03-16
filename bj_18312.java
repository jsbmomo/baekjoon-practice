import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_18312 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int count = 0;

    for (int h = 0; h <= N; h++) {
      for (int m = 0; m <= 59; m++) {
        for (int s = 0; s <= 59; s++) {
          if (check(h, m, s, K)) count++;
        }
      }
    }

    System.out.println(count);
    br.close();
  }

  public static boolean check(int h, int m, int s, int K) {
		return h/10==K || h%10==K || m/10==K || m%10==K || s/10==K || s%10==K;
	}
}
