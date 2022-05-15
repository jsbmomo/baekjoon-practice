import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2442 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int line = Integer.parseInt(br.readLine());
    int star = 1;

    for (int i = 1; i <= line; i++) {
      for (int j = i; j < line; j++) {
        bw.append(" ");
      }
      for (int z = 1; z <= star; z++) {
        bw.append("*");
      }
      bw.append("\n");
      star += 2;
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
