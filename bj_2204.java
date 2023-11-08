import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class bj_2204 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = 0;

    while ((count = Integer.parseInt(br.readLine())) != 0) {
      List<String> words = new ArrayList<>();

      for (int i = 0; i < count; i++) {
        words.add(br.readLine());
      }

      words.sort(String::compareToIgnoreCase);
      System.out.println(words.get(0));
    }

    br.close();
  }
}
