import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_4949 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder result = new StringBuilder();
    String input = "";
    boolean judge = false;

    CustomStack stack = new CustomStack();

    while (!(input = br.readLine()).equals(".")) {
      judge = true;

      for (char c : input.toCharArray()) {
        if (c == '(' || c == '[') {
          stack.push(c);
          continue;
        }

        if (c == ')') {
          if (stack.isEmply() || stack.peek() != '(') {
            judge = false;
            break;
          }

          stack.pop();
          continue;
        }

        if (c == ']') {
          if (stack.isEmply() || stack.peek() != '[') {
            judge = false;
            break;
          }

          stack.pop();
        }
      }

      result.append(judge ? "yes\n" : "no\n");
      stack.clear();
    }
    
    System.out.print(result.toString());
    br.close();
  }
}

class CustomStack {
  private char[] data;
  private int index;

  CustomStack() {
    this.data = new char[101];
    this.index = 0;
  }

  public char peek() {
    return data[index - 1];
  }

  public char pop() {
    return data[index--];
  }

  public void push(char c) {
    data[index++] = c;
  }

  public boolean isEmply() {
    return index == 0;
  }

  public  void clear() {
    this.index = 0;
  } 
}