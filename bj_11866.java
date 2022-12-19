import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj_11866 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Queue<Integer> queue = new LinkedList<>();

    String[] inputs = br.readLine().split(" ");
    int n = Integer.parseInt(inputs[0]);
    int k = Integer.parseInt(inputs[0]);

    for (int i = 1; i <= n; i++) {
      queue.add(i);
    }

    StringBuilder sb = new StringBuilder();
    sb.append('<');

    while (queue.size() > 1) {
      for (int i = 0; i < k - 1; i++) {
        queue.offer(queue.poll());
      }

      sb.append(queue.poll()).append(", ");
    }

    sb.append(queue.poll()).append('>');
    System.out.println(sb);
  }
}
