import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class bj_2164 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int card = Integer.parseInt(br.readLine());

    Queue<Integer> queue = new LinkedList<>();
    
    for (int i = 1; i <= card; i++) {
      queue.offer(i);
    }

    while (queue.size() > 1) {
      queue.poll();
      queue.offer(queue.poll());
    }

    System.out.println(queue.poll());
    br.close();
  }
}
