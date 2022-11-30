import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_17202 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String b = br.readLine();

    StringBuilder currentStr = new StringBuilder();

    for (int i = 0; i < a.length(); i++) {
      currentStr.append(a.charAt(i)).append(b.charAt(i));
    }

    StringBuilder result = currentStr;
    int len = currentStr.length();

    while (len-- > 2) {
      currentStr = new StringBuilder();
      
      for (int i = 0; i < len; i++) {
        int v = ((result.charAt(i) - '0') + (result.charAt(i + 1) - '0')) % 10;
        currentStr.append(v);
      }
      
      result = currentStr;
    }
    
    System.out.println(result);
  }
}
