import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_9086 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int test = Integer.parseInt(br.readLine());

    while (test-- > 0) {
      String str = br.readLine();
      
      sb.append(str.charAt(0))
        .append(str.charAt(str.length() - 1))
        .append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }
}
