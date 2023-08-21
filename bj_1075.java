import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1075 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int F = Integer.parseInt(br.readLine());

    int temp = (N / 100) * 100;

    while (true) {
      if (temp % F == 0) {
        int result = temp % 100;
        System.out.println(String.format("%02d", result));
        return;
      }
      
      temp ++;
    }
  }
}