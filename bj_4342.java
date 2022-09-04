import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_4342 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    StringBuilder sb = new StringBuilder();
    while(true) {
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      int M = Integer.parseInt(st.nextToken());

      if (N == 0 && M == 0) {
        break;
      }

      sb.append(GCD(N, M) ? "A wins\n" : "B wins\n");
    }

    bw.write(sb.toString());
    bw.flush();
    br.close();
    bw.close();
  }

  public static boolean GCD(int v1, int v2) {
    if (v1 > v2) {
      int temp = v1;
      v1 = v2;
      v2 = temp;
    }

    if (v2 % v1 == 0) {
      return true;
    }

    if (v2 - v1 < v1) {
      return !GCD(v2 - v1, v1);
    }

    return true;
  }
}
