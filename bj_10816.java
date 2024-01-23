import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class bj_10816 {
  static int N, M;
  static int[] compareNums;
  static Map<Integer, Integer> cards;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  static void solution() {
    StringBuilder sb = new StringBuilder();

    for (int num : compareNums) {
      int findValue = cards.get(num) == null ? 0 : cards.get(num);

      sb.append(findValue).append(" ");
    }

    System.out.println(sb.toString());
  }

  static void inputs() throws IOException {
    cards = new HashMap<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    
    for (int i = 0; i < N; i++) {
      int value = Integer.parseInt(st.nextToken());
      
      if (cards.containsKey(value)) {
        cards.put(value, cards.get(value) + 1);
        continue;
      }

      cards.put(value, 1);
    }

    M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());

    compareNums = new int[M];

    for (int i = 0; i < M; i++) {
      compareNums[i] = Integer.parseInt(st.nextToken());
    }

    br.close();
  }
}
