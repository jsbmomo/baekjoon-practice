import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class bj_11478 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final String str = br.readLine();
    final int len = str.length();

    int count = 0;

    HashMap<String, String> map = new HashMap<>();

    for (int i = 1; i <= len; i++) {
      for (int j = 0; j < len - i + 1; j++) {
        String newStr = str.substring(j, j + i);
        
        if (!map.containsKey(newStr)) {
          map.put(newStr, newStr);
          count++;
        }
      }
    }

    System.out.println(count);
    br.close();
  }
}
