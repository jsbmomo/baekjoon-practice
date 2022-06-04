import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2089 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int decimal = Integer.parseInt(br.readLine());

    while (decimal != 1) {
      sb.append(Math.abs(decimal % -2));
      decimal = (int) Math.ceil((double) decimal / (-2));
    }

    sb.append(decimal);

    System.out.println(sb.reverse());
  }
}
