import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11659 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] aryN = new int[N + 1];

    st = new StringTokenizer(br.readLine());
    aryN[1] = Integer.parseInt(st.nextToken());

    for (int i = 2; st.hasMoreTokens(); i++) {
      aryN[i] += aryN[i - 1] + Integer.parseInt(st.nextToken());
    }

    StringBuilder sb = new StringBuilder();

    for (int count = 0; count < M; count++) {
      st = new StringTokenizer(br.readLine());

      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());

      sb.append(aryN[j] - aryN[i - 1]).append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }
}
