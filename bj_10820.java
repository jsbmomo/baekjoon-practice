import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_10820 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int line = Integer.parseInt(br.readLine());
    int[][] cnt = new int[line][4];

    for (int i = 0; i < line; i++) {
      String input = br.readLine();
      
      for (int j = 0; j < input.length(); j++) {
        if (input.charAt(j) >= 'a' && input.charAt(j) <= 'z') {
          cnt[i][0]++;
        } else if (input.charAt(j) >= 'A' && input.charAt(j) <= 'Z') {
          cnt[i][1]++;
        } else if (input.charAt(j) >= '0' && input.charAt(j) <= '9') {
          cnt[i][2]++;
        } else if (input.charAt(j) == ' ') {
          cnt[i][3]++;
        }
      }
    }

    for (int w = 0; w < line; w++) {
      for (int z = 0; z < cnt[w].length; z++) {
        bw.write(cnt[w][z] + " ");
      }
      bw.write("\n");
    }

    bw.flush();
  }
}
