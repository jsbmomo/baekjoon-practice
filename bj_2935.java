import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class bj_2935 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    BigInteger a = new BigInteger(br.readLine());
    char calculation = br.readLine().charAt(0);
    BigInteger b = new BigInteger(br.readLine());

    if (calculation == '+') {
      System.out.println(a.add(b));
      return ;
    }

    if (calculation == '*') {
      System.out.println(a.multiply(b));
      return ;
    }
  }
}
