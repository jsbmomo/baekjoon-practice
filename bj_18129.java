import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_18129 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    String[] inputs = br.readLine().split(" ");
    String str = inputs[0].toLowerCase();
    int len = Integer.parseInt(inputs[1]);
    int count = 1;
    boolean[] check = new boolean[26];
    char compare = str.charAt(0);

    for (char c : str.toCharArray()) {
      if (compare == c) {
        count++;
      }
      else {
        if (!check[compare - 'a']) {
          sb.append(count >= len ? 1 : 0);
          check[compare - 'a'] = true;
        }

        compare = c;
        count = 1;
      }
    }
    
    System.out.println(sb);
    br.close();
  }
}
