import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1316 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    String[] words = new String[count];
    int result = 0;

    for (int i = 0; i < count; i++) {
      words[i] = br.readLine();
    }

    for (int i = 0; i < count; i++) {
      if (words[i].length() == 1) {
        result++;
        continue;
      }

      int[] alphabet = new int[26];
      char before = '1';
      for (int j = 0; j < words[i].length(); j++) {
        alphabet[words[i].charAt(j) - 97]++; // 체크 (증가)

         // 이전 알파벳과 같다면 (알파벳이 연속해서 나왔다면)
        if (before == words[i].charAt(j)) continue;
        
        // 이전 알파벳과 같지 않은데 기록한 흔적이 있다면
        if (words[i].charAt(j) != 0) {
          before = '0';
          break;
        }

        // 이전 알파벳과 다르고, 이전에 기록한 흔적이 없다면
        before = words[i].charAt(j);
      }

      if (before != '0') result++;
    }

    System.out.println(result);
    br.close();
  }
}
