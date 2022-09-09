import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_5582 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String b = br.readLine();

    int lenA = a.length();
    int lenB = b.length();

    int strLength = 0;

    int[][] map = new int[lenA][lenB];
    
    for (int i = 1; i <= lenA; i++) {
      for (int j = 1; j <= lenB; j++) {
        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          map[i][j] = map[i - 1][j - 1] + 1;
          strLength = Math.max(strLength, map[i][j]);
        }
      }
    }

    System.out.println(strLength);
  }
}
