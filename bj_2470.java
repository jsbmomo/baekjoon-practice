import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_2470 {

  private static int N;
  private static int[] ary;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  private static void solution() {
    Arrays.sort(ary);

    int i = 0;
    int j = N - 1;

    int gap = Integer.MAX_VALUE;
    int ans1 = 0, ans2 = 0;
    int temp, sum;

    while (i < j) {
      sum = ary[i] + ary[j];
      temp = Math.abs(sum);

      if (temp < gap) {
        gap = temp;
        ans1 = ary[i];
        ans2 = ary[j];
      }

      if (sum > 0) {
        j--;
        continue;
      }

      i++;
    }

    System.out.println(ans1 + " " + ans2);
  }

  private static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    N = Integer.parseInt(br.readLine());
    ary = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      ary[i] = Integer.parseInt(st.nextToken());
    }
    

    br.close();
  }
}
