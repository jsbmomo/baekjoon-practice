import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_2257 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Stack<Integer> stack = new Stack<>();

    String str = br.readLine();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      if (c == ')') {
        int num = 0;

        while (true) {
          if (stack.peek() == 0) {
            stack.pop();
            stack.push(num);
            break;
          }
          num += stack.pop();
        }
      } 
      else if (c == 'C') stack.push(12);
      else if (c == 'H') stack.push(1);
      else if (c == 'O') stack.push(16);
      else if (c >= '0' && c <= '9') stack.push(stack.pop() * (c - '0'));
      else stack.push(0);
    }

    int ans = 0;

    while (!stack.isEmpty()) ans += stack.pop();
    
    System.out.println(ans);
    br.close();
  }
}
