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
      if (words[i].length() <= 2) {
        result++;
        continue;
      }

      boolean isGroupWord = true;
      boolean[] alphabet = new boolean[26];

      alphabet[words[i].charAt(0) - 97] = true; // 첫 번째 알파벳 체크
      for (int j = 1; j < words[i].length(); j++) {  

        // 이전에 나온 알파벳과 같은지 비교한다.
        if (words[i].charAt(j - 1) == words[i].charAt(j)) continue;
        
        // 알파벳을 이전에 기록한 흔적이 있다면 break.
        if (alphabet[words[i].charAt(j) - 97]) {
          isGroupWord = false;
          break;
        }
        
        // words[i].charAt(j) 으로 나온 알파벳 체크
        alphabet[words[i].charAt(j) - 97] = true;
      }

      if (isGroupWord) result++;
    }

    System.out.println(result);
    br.close();
  }
}
