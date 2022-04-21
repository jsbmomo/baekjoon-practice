import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2742 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int print = Integer.parseInt(br.readLine());

    for (int val = print; val > 0; val--) {
      bw.write(val + "\n");
    }
    bw.flush();
    bw.close();
  }
}
