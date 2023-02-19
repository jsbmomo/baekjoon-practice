import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11282 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());

    input += 44031;

    char c = (char) input;

    System.out.println(c);

    br.close();
  }
}
