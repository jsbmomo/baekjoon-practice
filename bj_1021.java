import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj_1021 {
  static BufferedReader br = null;
  static LinkedList<Integer> deque = null;
  static StringTokenizer st = null;
  static int dequeSize;
  static int intCount;
  static int[] seq;

  public static void main(String[] args) throws IOException {
    initProgram();
    solution();
  }

  static void initProgram() throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    deque = new LinkedList<Integer>();

    st = new StringTokenizer(br.readLine(), " ");

    dequeSize = Integer.parseInt(st.nextToken());
    intCount = Integer.parseInt(st.nextToken());

    for (int i = 1; i <= dequeSize; i++) {
      deque.offer(i);
    }

    st = new StringTokenizer(br.readLine(), " ");
    seq = new int[intCount];

    for (int i = 0; i < intCount; i++) {
      seq[i] = Integer.parseInt(st.nextToken());
    }

    br.close();
  }

  static void solution() {
    int count = 0;

    for (int i = 0; i < intCount; i++) {
      int targetIndex = deque.indexOf(seq[i]);
      int halfIndex;

      halfIndex = deque.size() % 2 == 0 ? deque.size() / 2 - 1 : deque.size() / 2;
      
      if (targetIndex <= halfIndex) {
        for (int j = 0; j < targetIndex; j++) {
          deque.offerLast(deque.pollFirst());
          count++;
        }
      } else {
        for (int j = 0; j < deque.size() - targetIndex; j++) {
          deque.offerFirst(deque.pollLast());
          count++;
        }
      }

      deque.pollFirst();
    }

    System.out.println(count);
  }
}
