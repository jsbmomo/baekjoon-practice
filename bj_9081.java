import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_9081 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int line = Integer.parseInt(br.readLine());

    for (int i = 0; i < line; i++) {
      char[] word = br.readLine().toCharArray();

      int firstIndex = -1;
      int secondIndex = 0;
      char temp;

      for (int j = word.length - 1; j > 0; j--) {
        if (word[j - 1] < word[j]) {
          firstIndex = j - 1;
          break;
        }
      }

      if (firstIndex == -1) {
        for (int j = 0; j < word.length; j++) sb.append(word[j]);
        sb.append("\n");
        continue;
      }

      for (int j = word.length - 1; j >= 0; j--) {
        if (word[firstIndex] < word[j]) {
          secondIndex = j;
          break;
        }
      }

      temp = word[firstIndex];
      word[firstIndex] = word[secondIndex];
      word[secondIndex] = temp;
      
      Arrays.sort(word, firstIndex + 1, word.length);

      for (int j = 0; j < word.length; j++) sb.append(word[j]);
      sb.append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}