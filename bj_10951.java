import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bj_10951 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String input;
    int sum;
    while ((input = br.readLine()) != "\n") {
      sum = (input.charAt(0) - 48) + (input.charAt(2) - 48);
      sb.append(sum).append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}
