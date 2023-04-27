import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10989 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    int[] ary = new int[10001];

    for (int i = 1; i <= count; i++) {
      int input = Integer.parseInt(br.readLine());
      ary[input]++;
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 1; i < 10001; i++) {
      while (ary[i] > 0) {
        sb.append(i).append('\n');
        i--;
      }
    }

    System.out.print(sb.toString());
    br.close();
  }
}
