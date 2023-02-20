import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14659 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] mountain = new int[N];

    for (int i = 0; i < N; i++) {
      mountain[i] = Integer.parseInt(st.nextToken());
    }

    int max = 0;
    int count;

    for (int i = 0; i < N - 1; i++) {
      count = 0;
      for (int j = i + 1; j < N; j++) {
        if (mountain[i] > mountain[j]) count++;
        else break;
      }

      max = max < count ? count : max;
    }

    System.out.println(max);
    br.close();
  }
}
