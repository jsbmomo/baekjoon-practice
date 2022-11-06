import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_25304 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int price = Integer.parseInt(br.readLine());
    int count = Integer.parseInt(br.readLine());
    int sum = 0;

    for (int i = 0; i < count; i++) {
      String[] input = br.readLine().split(" ");

      sum += (Integer.parseInt(input[0]) * Integer.parseInt(input[1]));
    }

    System.out.println(price == sum ? "Yes" : "No");
  }
}
