import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10040 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] match = new int[N];
    int[] person = new int[M];
    int[] result = new int[N];
    int max = 0, cnt = 0;

    for (int i = 0; i < N; i++) {
      match[i] = Integer.parseInt(br.readLine());
      result[i] = 0;
    }

    for (int i = 0; i < M; i++) {
      person[i] = Integer.parseInt(br.readLine());
    }

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < N; j++) {
        if (match[j] <= person[i]) {
          result[j]++;
          break;
        }
      }
    }
    
    for (int i = 0; i < result.length; i++) {
      if (result[i] > max) {
        max = result[i];
        cnt = i + 1;
      }
    }

    System.out.println(cnt);
  }
}
