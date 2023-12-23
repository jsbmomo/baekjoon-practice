import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_16719 {
  static StringBuilder sb;
  static boolean[] visit;
  static String input;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    sb = new StringBuilder();
    
    input = br.readLine();
    visit = new boolean[input.length()];

    solution(0, input.length() - 1);

    System.out.println(sb.toString());
    br.close();
  }

  static void solution(int left, int right) {
    if (left > right) return;

    int index = left;

    for (int i = left; i <= right; i++) {
      if (input.charAt(index) > input.charAt(i)) index = i;
    }

    for (int i = 0; i < input.length(); i++) {
      if (visit[i]) sb.append(input.charAt(i));
    }

    sb.append("\n");

    solution(index - 1, right);
    solution(left, index - 1);
  }
}