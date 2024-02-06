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

    for (int i = 1; st.hasMoreTokens(); i++) {
      aryN[i] = Integer.parseInt(st.nextToken());
    }

    StringBuilder sb = new StringBuilder();
    int sum;

    for (int count = 0; count < M; count++) {
      st = new StringTokenizer(br.readLine());

      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());

      sum = 0;

      for (int range = i; range <= j; range++) {
        sum += aryN[range];
      }

      sb.append(sum).append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }
}
