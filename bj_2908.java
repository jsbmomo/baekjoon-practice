import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;

public class bj_2908 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    a = Integer.parseInt(sb.append(a).reverse().toString());

    sb = new StringBuilder();

    b = Integer.parseInt(sb.append(b).reverse().toString());

    System.out.println(a > b ? a : b);
  }
}
