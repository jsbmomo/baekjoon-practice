import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class bj_2346 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    Deque<Balloon> deque = new ArrayDeque<>();

    for (int index = 1; st.hasMoreTokens(); index++) {
      deque.add(new Balloon(index, Integer.parseInt(st.nextToken())));
    }

    StringBuilder sb = new StringBuilder();

    while (deque.size() > 1) {
      Balloon current = deque.poll();

      sb.append(current.getIndex()).append(" ");

      int move = current.getValue();

      if (move < 0) {
        while (move++ < 0) {
          deque.addFirst(deque.pollLast());
        }
      } else {
        move--;
        while (move-- > 0) {
          deque.addLast(deque.pollFirst());
        }
      }
    }

    sb.append(deque.poll().getIndex());

    System.out.println(sb.toString());
    br.close();
  }
}

class Balloon {
  private int index;
  private int value;

  Balloon(int index, int value) {
    this.index = index;
    this.value = value;
  }

  public int getIndex() {
    return index;
  }

  public int getValue() {
    return value;
  }
}
