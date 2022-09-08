import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1157 {

  static int[] count = new int[52];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String word = br.readLine();
    
    for (int i = 0; i < word.length(); i++) {
      if ('A' <= word.charAt(i) && 'Z' >= word.charAt(i)) {
        System.out.println(word.charAt(i) - 'A');
        count[word.charAt(i) - 'A']++;
        continue;
      }

      if ('a' <= word.charAt(i) && 'z' >= word.charAt(i)) {
        System.out.println(word.charAt(i) - 'a');
        count[word.charAt(i) - 'a' + 26]++;
        continue;
      }
    }

    int index = 0;
    boolean duplicate = false;
    for (int c = 1; c < count.length; c++) {
      if (count[c] != 0 && count[c] == count[index]) {
        duplicate = true;
        break;
      }

      if (count[c] > count[index]) {
        index = c;
      }
    }

    if (duplicate) System.out.println("?");
    else System.out.println((char) index + 'A');

    br.close();
  }

  public static void print(Object val) {
    System.out.println(val.toString());
  }
}