import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_10810 {
  static BufferedReader br = null;
  static BufferedWriter bw = null;
  static StringTokenizer st = null;
  static StringBuilder sb = null;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    int line = Integer.parseInt(st.nextToken());

    int[] ary = new int[num];

    for (int i = 0; i < line; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());
      int ballum = Integer.parseInt(st.nextToken());

      for (int j = start - 1; j < end; j++) {
        ary[j] = ballum;
      }
    }
    
    bw = new BufferedWriter(new OutputStreamWriter(System.out));
    sb = new StringBuilder();
    for (int i = 0; i < ary.length; i++) {
      sb.append(ary[i]).append(' ');
    }

    bw.append(sb.toString());
    bw.close();
    br.close();
  }
}
