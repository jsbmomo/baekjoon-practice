import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_9366 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count = Integer.parseInt(br.readLine());

    int[][] triangle = new int[count][3];

    for (int i = 0; i < count; i++) {
      int j = 0;
      for (String s : br.readLine().split(" ")) {
        triangle[i][j++] = Integer.parseInt(s);
      }
    }

    StringBuilder sb = new StringBuilder();
    int caseNum = 1;
    for (int[] t : triangle) {
      if ((t[0] == t[1]) && (t[1] == t[2])) {
        sb.append("Case #" + caseNum + ": equilateral\n");
      } else if (
        (t[0] == t[1]) || (t[1] == t[2]) || (t[0] == t[2])
      ) {
        sb.append("Case #" + caseNum + ": isosceles\n");
      } else if (
        (t[0] != t[1]) && (t[1] != t[2]) && (t[0] != t[2])
      ) {
        sb.append("Case #" + caseNum + ": scalene\n");
      } else {
        sb.append("Case #" + caseNum + ": invalid!\n");
      }
    }

    bw.append(sb.toString());
    bw.close();
    br.close();
  }
}
