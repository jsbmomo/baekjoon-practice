import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj_1966 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < testCase; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int count = Integer.parseInt(st.nextToken());
      int order = Integer.parseInt(st.nextToken());

      LinkedList<int[]> queue = new LinkedList<>();
      st = new StringTokenizer(br.readLine());

      for (int j = 0; j < count; j++) {
        queue.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
      }

      int printCount = 0;

      while (!queue.isEmpty()) {
        int[] front = queue.poll();
        boolean isMax = true;

        for (int k = 0; k < queue.size(); k++) {
          if (front[1] < queue.get(k)[1]) {
            queue.offer(front);

            for (int z = 0; z < k; z++) {
              queue.offer(queue.poll());
            }

            isMax = false;
            break;
          }
        }

        if (isMax == false) continue;

        count++;

        if (front[0] == order) break;
      }

      sb.append(printCount).append('\n');
    }

    System.out.println(sb);
  }
}
