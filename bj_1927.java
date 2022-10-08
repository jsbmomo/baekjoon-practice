import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class bj_1927 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int times = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x));

    for (int i = 0; i < times; i++) {
      int val = Integer.parseInt(br.readLine());

      if (val == 0) {
        if (queue.isEmpty()) System.out.println("0");
        else System.out.println(queue.poll());
      } else {
        queue.add(val);
      }
    }

  }
}
