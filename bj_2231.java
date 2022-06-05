import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2231 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int result = 0;

    for (int i = 0; i < str.length(); i++) {
      int num = i;
      int sum = 0;

      while (num != 0) {
        sum += num % 10;
        num /= 10;
      }

      if (sum + i == num) {
        result = i;
        break;
      }
    }

    System.out.println(result);
  }
}
