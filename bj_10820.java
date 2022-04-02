import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_10820 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String input = "";

    while ((input = br.readLine()) != null) {
      int[] cnt = new int[4];

      for (int j = 0; j < input.length(); j++) {
        if (input.charAt(j) >= 'a' && input.charAt(j) <= 'z') {
          cnt[0]++;
        } else if (input.charAt(j) >= 'A' && input.charAt(j) <= 'Z') {
          cnt[1]++;
        } else if (input.charAt(j) >= '0' && input.charAt(j) <= '9') {
          cnt[2]++;
        } else if (input.charAt(j) == ' ') {
          cnt[3]++;
        }
      }

      for (int z = 0; z < cnt.length; z++) {
        bw.write(cnt[z] + " ");
      }
      bw.write("\n");
    }

    bw.flush();
  }
}
