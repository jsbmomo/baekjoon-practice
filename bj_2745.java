import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2745 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String str = st.nextToken();
    int binary = Integer.parseInt(st.nextToken());
    long result = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        // result += (Math.pow(binary, i) * ((c - 'A') + 10));
        result = result * binary + (c - 'A' + 10);
      } else {
        // result += (Math.pow(binary, i) * (c - '0'));
        result = result * binary + (c - '0');
      }
    }

    System.out.println(result);
  }
}
