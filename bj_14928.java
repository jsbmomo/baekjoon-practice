import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_14928 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    long temp = 0;

    for (int i = 0; i < input.length(); i++) {
      temp = (temp * 10 + (input.charAt(i) - '0')) % 20000303;
    }
    
    br.close();
  }
}
