import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_30957 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int student = Integer.parseInt(br.readLine());
    final String str = br.readLine();

    int B = 0, S = 0, A = 0;

    for (int i = 0; i < student; i++) {
      char c = str.charAt(i);

      if (c == 'B') {
        B++;
      } else if (c == 'S') {
        S++;
      } else if (c == 'A') {
        A++;
      }
    }

    if (B == S && S == A) {
      System.out.println("SCU");
    } else if (B == S) {
      System.out.println("BS");
    } else if (S == A) {
      System.out.println("SA");
    } else {
      System.out.println(Math.max(Math.max(B, S), A));
    }
    
    br.close();
  }
}
