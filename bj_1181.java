import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_1181 {
  static int count;
  static String[] words;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  static void solution() {
    Arrays.sort(words);

    StringBuilder sb = new StringBuilder();

    for (String word : words) {
      sb.append(word).append('\n');
    }

    System.out.println(sb.toString());
  }

  static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    count = Integer.parseInt(br.readLine());
    words = new String[count];

    for (int i = 0; i < count; i++) {
      words[i] = br.readLine();
    }

    br.close();
  }
}
