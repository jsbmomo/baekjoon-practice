import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_21312 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int answer1 = 1, answer2 = 1;
    boolean check = false;

    for (int i = 0; i < 3; i++) {
      int a = Integer.parseInt(st.nextToken());

      if (a % 2 == 1) {
        answer1 *= a;
        if (!check) check = true;
      }

      answer2 *= a;
    }

    System.out.println(check ? answer1 : answer2);
  }
}
