import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_17284 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int money = 5000;
    int[] drink = { 500, 800, 1000 };
    String[] num = br.readLine().split(" ");
    int len = num.length;

    for (int i = 0; i < len; i++) {
      int button = Integer.parseInt(num[i]);
      money -= drink[button - 1];
    }

    System.out.println(money);
    br.close();
  }
}
