import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1254 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int result = input.length();

    for (int i = 0; i < input.length(); i++) {
      if (checkPalind(input.substring(i))) {
        break;
      }
      result++;
    }
    
    System.out.println(result);
    br.close();
  }

  private static boolean checkPalind(String str) {
    int lastIndex = str.length() - 1;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != str.charAt(lastIndex)) {
        return false;
      }
    }
    return true;
  }
}
