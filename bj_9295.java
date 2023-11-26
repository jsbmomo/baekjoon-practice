import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9295 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int count = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= count; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int num1 = Integer.parseInt(st.nextToken());
      int num2 = Integer.parseInt(st.nextToken());

      sb.append(String.format("Case %d: %d\n", i, num1 + num2));
    }

    System.out.println(sb.toString());
    br.close();
  }
}
