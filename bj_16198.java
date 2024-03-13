import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class bj_16198 {

  static int N;
  static int max = Integer.MAX_VALUE;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      list.add(Integer.parseInt(st.nextToken()));
    }

    change(list, 0);

    System.out.println(max);
    br.close();
  }

  private static void change(List<Integer> list, int sum) {
    if (list.size() == 2) {
      max = Math.max(max, sum);
      return;
    }

    for (int i = 1; i < list.size() - 1; i++) {
      int temp = list.get(i);
      int value = list.get(i - 1) * list.get(i + 1);

      list.remove(i);

      change(list, sum + value);

      list.add(i, temp);
    }
  }
}
