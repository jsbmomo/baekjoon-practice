import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj_11478 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final String str = br.readLine();
    final int len = str.length();

    HashSet<String> hash = new HashSet<>();

    for (int i = 1; i <= len; i++) {
      for (int j = 0; j <= len - i; j++) {
        String newStr = str.substring(j, j + i);
        
        if (!hash.contains(newStr)) {
          hash.add(newStr);
        }
      }
    }

    System.out.println(hash.size());

    br.close();
  }
}
