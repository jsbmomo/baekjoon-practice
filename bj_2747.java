import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2747 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int result = 0;
    int a = 0;
    int b = 1;

    for (int i = 1; i <= num; i++) {
      a = b;
      b = result;
      result = a + b;
    }

    System.out.println(result);
  }
}
