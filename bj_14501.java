import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14501 {
  static StringTokenizer st;
  static int[] benefit;
  static int[] need;
  static int[] cost;
  static int day;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    day = Integer.parseInt(br.readLine());
    need = new int[day];
    cost = new int[day];

    for (int i = 0; i < day; i++) {
      st = new StringTokenizer(br.readLine());
      need[i] = Integer.parseInt(st.nextToken());
      cost[i] = Integer.parseInt(st.nextToken());
    }

    findMaxBenefit();

    br.close();
  }

  public static void findMaxBenefit() {
    benefit = new int[day + 1];

    for (int i = day - 1; i > 0; i--) {
      if (need[i] > day - i) {
        benefit[i] = benefit[i + 1];
      } else {
        benefit[i] = Math.max(cost[i] + benefit[i + need[i]], benefit[i + 1]);
      }
    }

    System.out.println(benefit[0]);
  }
}
