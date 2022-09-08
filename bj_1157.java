import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1157 {

  static int[] count = new int[26];

  public static void main(String[] args) throws IOException {
    // 백준에서 BufferedReader 를 사용한 문자열 입력 시, error 발생
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    word = word.substring(0, word.length() - 1);
    
    for (int i = 0; i < word.length(); i++) {
      if ('A' <= word.charAt(i) && 'Z' >= word.charAt(i)) {
        count[word.charAt(i) - 'A']++;
      } else {
        count[word.charAt(i) - 'a']++;
      }
    }

    int value = 0;
    char result = '?';
    
    for (int c = 0; c < count.length; c++) {
      if (count[c] > value) {
        value = count[c];
        result = (char) (c + 'A');
      } else if (count[c] == value) {
        result = '?';
      }
    }

    System.out.print(result);

    br.close();
  }
}
