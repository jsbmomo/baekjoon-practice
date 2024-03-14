import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class bj_1181 {
  static int count;
  static String[] words;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  static void solution() {
    Arrays.sort(words, new Comparator<String>() {
      public int compare(String s1, String s2) {
        if (s1.length() == s2.length()) return s1.compareTo(s2);
        else return s1.length() - s2.length();
      }
    });

    StringBuilder sb = new StringBuilder();

    sb.append(words[0]).append('\n');

    for (int i = 1; i < count; i++) {
      if (!words[i].equals(words[i - 1])) sb.append(words[i]).append('\n');
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
