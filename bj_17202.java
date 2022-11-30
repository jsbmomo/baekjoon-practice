import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_17202 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String b = br.readLine();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < a.length(); i++) {
      sb.append(a.charAt(i)).append(b.charAt(i));
    }

    String result = sb.toString();
    int len = sb.length();

    StringBuilder beforeStr;
    StringBuilder currentStr;

    while (len > 2) {
      beforeStr = new StringBuilder(result);
      currentStr = new StringBuilder();
      
      for (int i = 0; i < len - 1; i++) {
        int v = ((beforeStr.charAt(i) - '0') + (beforeStr.charAt(i + 1) - '0')) % 10;
        currentStr.append(v);
      }
      
      result = currentStr.toString();
      len--;
    }
    
    System.out.println(result);
  }
}
