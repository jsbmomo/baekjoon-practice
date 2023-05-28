import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class bj_1655 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int count = Integer.parseInt(br.readLine());

    PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o1 - o2);

    for (int i= 0; i < count; i++ ){
      int num = Integer.parseInt(br.readLine());

      if (minHeap.size() == maxHeap.size()) maxHeap.offer(num);
      else minHeap.offer(num);

      if (!minHeap.isEmpty() && !maxHeap.isEmpty()) {
        if (minHeap.peek() < maxHeap.peek()) {
          int temp = minHeap.poll();
          minHeap.offer(maxHeap.poll());
          maxHeap.offer(temp);;
        }
      }

      sb.append(maxHeap.peek()).append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }
}
