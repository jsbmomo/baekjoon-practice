import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_5555 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final String ring = br.readLine();
    final int count = Integer.parseInt(br.readLine());

    int counter = 0;

    for (int i = 0; i < count; i++) {
      String input = br.readLine();
      counter += input.concat(input).contains(ring) ? 1 : 0;
    }

    System.out.println(counter);
    br.close();
  }
}
