import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_16171 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final String S = br.readLine();
    final String K = br.readLine();

    final int sLength = S.length();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < sLength; i++) {
      char c = S.charAt(i);

      if (c < '0' || c > '9') continue;
    
      sb.append(c);
    }

    System.out.println(K.indexOf(sb.toString()) != -1 ? 1 : 0);

    /** Case 2 */
    final String str1 = br.readLine().replaceAll("[0-9]", "");
    final String str2 = br.readLine();

    System.out.println(str1.indexOf(str2) != -1 ? 1 : 0);

    br.close();
  }
}
