import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_9237 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());
    int[] ary = new int[count];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < count; i++) {
      ary[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(ary);

    int maxDay = 0;

    for (int i = 0; i < count; i++) {
      maxDay = Math.max(maxDay, ary[i] + i + 1);
    }

    maxDay += 1;

    System.out.println(maxDay);
    br.close();
  }
}
