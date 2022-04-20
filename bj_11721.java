import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class bj_11721 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String sb = br.readLine();

    for (int idx = 0; idx < sb.length(); idx++) {
      System.out.print(sb.charAt(idx));
      if ((idx % 10) == 9) {
        System.out.print("\n");
      }
    }
  }
}
