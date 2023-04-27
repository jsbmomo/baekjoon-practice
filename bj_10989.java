import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10989 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    int[] ary = new int[10001];
    int[] storeIndex = new int[count + 1];

    for (int i = 1; i <= count; i++) {
      int input = Integer.parseInt(br.readLine());
      ary[input]++;
      storeIndex[i] = input;
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 1; i < 10001; i++) {
      if (ary[i] > 0) {
        for (int j = ary[i]; j > 0; j--) {
          sb.append(i).append('\n');
        }
      }
    }

    System.out.print(sb.toString());
    br.close();
  }
}
