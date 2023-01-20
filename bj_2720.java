import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2720 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < testCase; i++) {
      int money = Integer.parseInt(br.readLine());

      int q = money / 25;
      money = money % 25;

      int d = money / 10;
      money = money % 10;

      int n = money / 5;
      money = money % 5;

      System.out.println(String.format("%d %d %d %d", q,d,n,money));
    }
    
    br.close();
  }
}
