import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_11899 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final char[] inputs = br.readLine().toCharArray();
    Stack<Character> stack = new Stack<>();

    int ans = 0;

    for (char c : inputs) {
      if (c == '(') {
        stack.add(c);
        continue;
      }

      if (stack.isEmpty()) {
        ans++;
        continue;
      }

      stack.pop();
    }

    ans += stack.size();

    System.out.println(ans);
    br.close();
  }
}
