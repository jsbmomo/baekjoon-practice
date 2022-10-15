import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_1427 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String num = br.readLine();

    char[] str = num.toCharArray();

    Arrays.sort(str);

    for (int i = str.length - 1; i >= 0; i--) {
      System.out.print(str[i]);
    }

    br.close();
  }
}
