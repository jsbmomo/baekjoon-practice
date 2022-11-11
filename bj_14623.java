import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_14623 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String b = br.readLine();

    long aLong = Long.parseLong(a, 2);
    long bLong = Long.parseLong(b, 2);

    String sum = Long.toBinaryString(aLong * bLong);

    System.out.println(sum);

    br.close();
  }
}
