import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_17298 {
  static int size;
  static int[] inputs;
  static BufferedReader br;
  static StringTokenizer st;
  static StringBuilder sb;
  
  public static void main(String[] args) throws IOException {    
    br = new BufferedReader(new InputStreamReader(System.in));

    size = Integer.parseInt(br.readLine());
    inputs = new int[size];
    st = new StringTokenizer(br.readLine());

    for (int i = 0; st.hasMoreTokens(); i++) {
      inputs[i] = Integer.parseInt(st.nextToken());
    }
    
    CustomStack stack = new CustomStack(size);

    for (int i = 0; i < size; i++) {
      while (!stack.isEmply() && inputs[stack.peek()] < inputs[i]) {
        inputs[stack.pop()] = inputs[i];
      }
      stack.push(i);
    }

    while (!stack.isEmply()) {
      inputs[stack.pop()] = -1;
    }

    sb = new StringBuilder();
    for (int i = 0; i < size; i++)  {
      sb.append(inputs[i]).append(" ");
    }

    System.out.println(sb.toString());
    br.close();
  }

  static class CustomStack {
    private int size;
    private int index;
    private int[] data;

    CustomStack(final int size) {
      this.size = size;
      this.index = 0;
      this.data = new int[size];
    }

    public int pop() {
      if (isEmply()) {
        return -1;
      }
      return data[--index];
    }

    public int peek() {
      if (isEmply()) {
        return -1;
      }
      return data[index - 1];
    }

    public void push(int value) {
      if (isFull()) {
        System.out.println("Stack is full...");
        System.exit(0);
      }
      data[index++] = value;
    }

    public boolean isEmply() {
      return index == 0;
    }

    public boolean isFull() {
      return index == size;
    }

    public int size() {
      return index;
    }
  }
}
