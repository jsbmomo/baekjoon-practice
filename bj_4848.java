import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_4848 {

  static StringBuilder sb = null;
  static String[] group;

  public static void main(String[] args) throws IOException {
    createVariables();

    solution();
  }

  static void createVariables() {
    group = new String[16];

    group[0] = "{}";
    group[1] = "{{}}";

    for (int i = 2; i < 16; i++) {
      sb = new StringBuilder();
      sb.append("{");
      for (int j = 0; j < i; j++) {
        sb.append(group[j]);
        if (j != i - 1) sb.append(",");
      }
      sb.append("}");
      group[i] = sb.toString();
    }
  }

  static void solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    sb = new StringBuilder();

    int count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++) {
      String k = br.readLine();
      String l = br.readLine();

      int sum = 0;

      for (int j = 0; j < 16; j++) {
        if (k.equals(group[j]) || l.equals(group[j])) {
          sum += i;
        }
      }

      sb.append(group[sum]).append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}
