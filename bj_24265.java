import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_24265 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();
    sb.append(11 * num * (num - 1) / 2);
    sb.append("\n2");

    System.out.println(sb.toString());

    br.close();
  }
}
