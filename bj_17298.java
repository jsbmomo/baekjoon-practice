import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_17298 {
  static BufferedReader br;
  static StringBuilder sb;
  static StringTokenizer st;
  static CustomStack stack;
  static int[] values;
  static int count;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));

    count = Integer.parseInt(br.readLine());
    values = new int[count];
    stack = new CustomStack(count);

    st = new StringTokenizer(br.readLine());
      
    for (int i = 0; i < count; i++) {
      values[i] = Integer.parseInt(st.nextToken());
      findNGE(i);
    }
    
    sb = new StringBuilder();

    while (stack.hasMoreElements()) {
      values[stack.pop()] = - 1;
    }

    for (int value : values) {
      sb.append(value).append(' ');
    }

    System.out.println(sb.toString());
    br.close();
  }

  private static void findNGE(final int index) {
    if (stack.size() == 0) {
      stack.push(index);
      return ;
    }
    
    int currentValue = values[index];
    int stackCapacity = stack.size();

    for (int i = 1; i <= stackCapacity; i++) {
      int stackTopValue = values[stack.peek()];

      if (stackTopValue < currentValue) {
        values[index - i] = currentValue;
        stack.pop();
      }
    }

    stack.push(index);
  }
}

class CustomStack {
  private int index;
  private int[] values;

  CustomStack(final int size) {
    this.index = 0;
    this.values = new int[size];
  }

  public void push(int value) {
    values[++index] = value;
  }

  public int pop() {
    return values[index--];
  }

  public int peek() {
    return values[index];
  }

  public int size() {
    return index;
  }

  public boolean hasMoreElements() {
    return index != 0 ? true : false;
  }
}