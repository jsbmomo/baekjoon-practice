import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_10828 {

  static int[] stack = new int[10001];
  static int index;

  static BufferedReader br;
  static BufferedWriter bw;
  static StringTokenizer st;
  static StringBuilder sb;
  static int loop;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));
    sb = new StringBuilder();
    loop = Integer.parseInt(br.readLine());

    for (int i = 0; i < loop; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      String command = st.nextToken();

      switch (command) {
        case "push":
          push(Integer.parseInt(st.nextToken()));
          break;
        case "pop":
          sb.append(pop()).append('\n');
          break;
        case "size":
          sb.append(size()).append('\n');
          break;
        case "empty":
          sb.append(empty()).append('\n');
          break;
        case "top":
          sb.append(top()).append('\n');
          break;
      }
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }

  static void push(int input) {
    stack[++index] = input;
  }

  static int pop() {
    return index != 0 ? stack[index--] : -1;
  }

  static int size() {
    return index;
  }

  static int empty() {
    return index == 0 ? 1 : 0;
  }

  static int top() {
    return index != 0 ? stack[index] : -1;
  }
}
