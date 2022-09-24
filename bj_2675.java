import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2675 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = Integer.parseInt(br.readLine());

    int[] repeatCount = new int[count];
    String[] repeatStr = new String[count];

    for (int i = 0; i < count; i++) {
      String[] input = br.readLine().split(" ");
      repeatCount[i] = Integer.parseInt(input[0]);
      repeatStr[i] = input[1];
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      for (int j = 0; j < repeatStr[i].length(); j++) {
        for (int z = 0; z < repeatCount[i]; z++) {
          sb.append(repeatStr[i].charAt(j));
        }
      }
      sb.append("\n");
    }

    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
