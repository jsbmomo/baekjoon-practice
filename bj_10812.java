import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_10812 {
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int bucketCount = Integer.parseInt(st.nextToken());
    int[] bucket  = new int[bucketCount + 1];
    int order = Integer.parseInt(st.nextToken());

    for (int i = 1; i < bucketCount + 1; i++) {
      bucket[i] = i;
    }

    Queue<Integer> queue = new LinkedList<>();

    for (int play = 0; play < order; play++) {
      st = new StringTokenizer(br.readLine());

      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());

      for (int index = k; index <= j; index++) {
        queue.add(bucket[index]);
      }

      for (int index = i; index < k; index++) {
        queue.add(bucket[index]);
      }

      for (int index = i; index <= j; index++) {
        bucket[index] = queue.poll();
      }

      queue.clear();
    }

    StringBuilder sb = new StringBuilder();
    for (int index = 1; index < bucketCount + 1; index++) {
      sb.append(bucket[index]).append(" ");
    }
    System.out.println(sb.toString());
    
    br.close();
  }
}
