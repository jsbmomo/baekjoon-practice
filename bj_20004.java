import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_20004 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = Integer.parseInt(br.readLine());

    for (int i = 1; i <= count; i++ ) {
      if ((30 % (i + 1)) == 0) {
        bw.append(i + "\n");
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
