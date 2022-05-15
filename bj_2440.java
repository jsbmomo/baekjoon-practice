import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2440 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int line = Integer.parseInt(br.readLine());

    for (int i = line; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        bw.append("*");
      }
      bw.append("\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}