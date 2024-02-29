import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_5218 {

  static int count;
  static String[] str;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  private static void solution() {
    StringBuilder sb = new StringBuilder();
    final String prefix = "Distances: ";

    StringTokenizer st;

    for (int i = 0; i < count; i++) {
      st = new StringTokenizer(str[i]);
      
      String s1 = st.nextToken();
      String s2 = st.nextToken();

      int len = s1.length();

      sb.append(prefix);

      for (int j = 0; j < len; j++) {
        sb.append(s2.charAt(j) - s1.charAt(j)).append(' ');
      }

      sb.append('\n');
    }

    System.out.println(sb.toString());
  }

  private static void inputs() throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    count = Integer.parseInt(br.readLine());

    str = new String[count];

    for (int i = 0; i < count; i++) {
      str[i] = br.readLine();
    }

    br.close();
  }


}
