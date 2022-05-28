import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_11653 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int number = Integer.parseInt(br.readLine());

    for (int i = 2; i <= number / 2; i++) {
      while (number % i == 0) {
        sb.append(i + "\n");
        number /= i;
      }
    }

    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
