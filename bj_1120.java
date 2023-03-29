import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1120 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");

    int result = inputs[0].length();

    for (int i = 0; i <= inputs[1].length() - inputs[0].length(); i++) {
      int count = 0;

      for (int j = 0; j < inputs[0].length(); j++) {
        if (inputs[0].charAt(j) != inputs[1].charAt(i + j)) {
          count++;
        }
      }

      result = Math.min(count, result);
    }
    
    System.out.println(result);
    br.close();
  }
}
