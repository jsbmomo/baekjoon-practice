import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj_11651 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = Integer.parseInt(br.readLine());
    int[][] ary = new int[count][2];

    for (int i = 0; i < count; i++) {
      String[] input = br.readLine().split(" ");
      ary[i][1] = Integer.parseInt(input[0]);
      ary[i][0] = Integer.parseInt(input[1]);
    }

    Arrays.sort(ary, (e1, e2) -> {
      if (e1[0] == e2[0]) {
        return e1[1] - e2[1];
      } else {
        return e1[0] - e2[0];
      }
    });

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      sb.append(ary[i][1] + " " + ary[i][0] + "\n");
    }

    bw.append(sb.toString());
    br.close();
    bw.close();
  }
}
