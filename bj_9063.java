import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_9063 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    StringTokenizer st = null;

    int[] x = new int[count];
    int[] y = new int[count];

    for (int i = 0; i < count; i++) {
      st = new StringTokenizer(br.readLine());

      x[i] = Integer.parseInt(st.nextToken());
      y[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(x);
    Arrays.sort(y);

    System.out.println((x[count - 1] - x[0]) * (y[count - 1] - y[0]));
    br.close();
  }
}
