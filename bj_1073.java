import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1073 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    while (st.hasMoreTokens()) {
      String number = st.nextToken();

      if (number.equals("0")) break;

      sb.append(number).append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}
