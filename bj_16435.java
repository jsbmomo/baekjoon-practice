import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_16435 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine());

    int fruitCount = Integer.parseInt(st.nextToken());
    int snakeLength = Integer.parseInt(st.nextToken());
    int[] fruit = new int[fruitCount];

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < fruitCount; i++) {
      fruit[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(fruit);

    for (int i = 0; i < fruitCount; i++) {
      if (fruit[i] <= snakeLength) {
        snakeLength++;
      } else {
        break;
      }
    }

    sb.append(snakeLength).append("\n");

    System.out.println(sb.toString());
    br.close();
  }
}
