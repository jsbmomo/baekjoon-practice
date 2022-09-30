import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_10828 {

  static int[] stack;
  static int index;

  static BufferedReader br;
  static BufferedWriter bw;
  static StringTokenizer st;
  static int loop;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));
    loop = Integer.parseInt(br.readLine());
    stack = new int[loop + 1];

    for (int i = 0; i < loop; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      String command = st.nextToken();

      if (command.equals("push")) {
        push(Integer.parseInt(st.nextToken()));
      } else if (command.equals("pop")) {
        bw.write(pop());
        bw.newLine();
      } else if (command.equals("size")) {
        bw.write(size());
        bw.newLine();
      } else if (command.equals("empty")) {
        bw.write(empty());
      } else {
        bw.write(top());
        bw.newLine();
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }

  static void push(int input) {
    stack[++index] = input;
  }

  static String pop() {
    return index != 0 ? String.valueOf(stack[index--]) : "-1";
  }

  static String size() {
    return String.valueOf(index);
  }

  static String empty() {
    return index == 0 ? "1\n" : "0\n";
  }

  static String top() {
    return index != 0 ? String.valueOf(stack[index]) : "-1";
  }
}
