import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_1388 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

    int cols = Integer.parseInt(st.nextToken());
    int rows = Integer.parseInt(st.nextToken());
    char graph[][] = new char[cols][rows];
    int ansCount = 0;

    for (int i = 0; i < cols; i++) {
      graph[i] = br.readLine().toCharArray();
      for (int j = 0; j < rows; j++) {
        if (graph[i][j] == '-') {
          ansCount++;
          while (j < rows && graph[i][j] == '-') {
            j++;
          }
        }
      }
    }

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (graph[j][i] == '|') {
          ansCount++;
          while (j < cols && graph[j][i] == '|') {
            j++;
          }
        }
      }
    }

    sb.append(ansCount);
    sb.append("\n");
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
