import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_17413 {
  static BufferedReader br;
  static StringBuilder sb;
  static Stack<Character> stack;
  
  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    sb = new StringBuilder();
    stack = new Stack<>();

    String input = br.readLine();
    boolean isTag = false;

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == '<') {
        isTag = true;
        storeAndClearStack();
        sb.append(input.charAt(i)); // append '<'
        continue;
      } else if (input.charAt(i) == '>') {
        isTag = false;
        sb.append(input.charAt(i)); // append '>'
        continue;
      } else if (input.charAt(i) == ' ') {
        storeAndClearStack();
        sb.append(input.charAt(i)); // append ' '
        continue;
      }
      
      if (isTag) { 
        sb.append(input.charAt(i));
      } else {
        stack.add(input.charAt(i));
      }
    }

    storeAndClearStack();

    System.out.println(sb);
    br.close();
  }

  public static void storeAndClearStack() { 
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
  }
}
