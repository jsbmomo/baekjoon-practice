import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1919 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] alpha = new int[26]    ;

    int sum = 0;

    char[] word1 = br.readLine().toCharArray();
    char[] word2 = br.readLine().toCharArray();

    for (char c : word1) {
      alpha[c - 97] += 1;
    }

    for (char c : word2) {
      alpha[c - 97] -= 1;
    }

    for (int i = 0; i < alpha.length; i++) {
      if (alpha[i] != 0) {
        sum += alpha[i];
      }
    }
    
    System.out.println(sum);
    br.close();
  }
}
