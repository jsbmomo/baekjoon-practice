import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1145 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    final int size = 5;
    int[] ary = new int[size];

    for (int i = 0; st.hasMoreTokens(); i++) {
      ary[i] = Integer.parseInt(st.nextToken());
    }

    int min = findMin(ary);
    int count = 0;

    while (true) {
      for (int i = 0; i < size; i++) {
        if (min % ary[i] == 0) count++;
      }

      if (count >= 3) break;
      else {
        count = 0;
        min++;
      }
    }

    System.out.println(count);
    br.close();
  }

  private static int findMin(int[] ary) {
    int min = Integer.MAX_VALUE;

    for (int val : ary) {
      if (min > val) min = val;
    }

    return min;
  }
}
