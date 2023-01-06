import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_2738 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[][] aryFirst = new int[N][M];
    int[][] arySecond = new int[N][M];

    for (int[] rows : aryFirst) {
      st = new StringTokenizer(br.readLine());

      for (int i = 0; i < M; i++) {  
        rows[i] = Integer.parseInt(st.nextToken());
      }
    }

    for (int[] rows : arySecond) {
      st = new StringTokenizer(br.readLine());

      for (int i = 0; i < M; i++) {  
        rows[i] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        sb.append(aryFirst[i][j] + arySecond[i][j]).append(" ");
      }
      sb.append("\n");
    }

    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
