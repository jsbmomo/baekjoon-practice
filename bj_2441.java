import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2441 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int line = Integer.parseInt(br.readLine());

    for (int i = 0; i < line; i++) {
      for (int j = 0; j < line - i; j++) {
        bw.append("*");
      }
      bw.append("\n");

      for (int z = 0; z < i + 1; z++) {
        bw.append(" ");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}