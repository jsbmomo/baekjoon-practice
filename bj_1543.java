import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1543 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String book = br.readLine();
    String word = br.readLine();

    int count = 0;

    for (int i = 0; i < book.length(); i++) {
      boolean match = true;

      for (int j = 0; j < word.length(); j++) {
        if (i + j >= book.length() || // 범위 체크
            book.charAt(i + j) != word.charAt(j)) {
          match = false;
          break;
        }
      }

      if (match) {
        count++;
        i += word.length() - 1; // 반복문에서 1 더해지는 것을 감안
      }
    }
    
    System.out.println(count);
    br.close();
  }
}
