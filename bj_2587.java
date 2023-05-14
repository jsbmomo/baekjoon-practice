import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_2587 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] ary = new int[5];
    int sum = 0;

    for (int i = 0; i < 5; i++) {
      ary[i] = Integer.parseInt(br.readLine());
      sum += ary[i];
    }

    Arrays.sort(ary);

    System.out.printf("%d\n%d\n", sum / 5, ary[2]);

    br.close();
  }
}
