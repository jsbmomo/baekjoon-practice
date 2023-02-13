import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_5988 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      String input = br.readLine();
      sb.append(Integer.parseInt(input.substring(input.length() - 1)) % 2 == 0 ? "even\n" : "odd\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}
