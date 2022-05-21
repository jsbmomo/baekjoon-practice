import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2133 {
  
  private static int[] tile;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    tile = new int[count + 1];
    if (count % 2 == 0) {
        tile[0] = 1;
        tile[2] = 3;
        for (int i = 4; i <= count; i += 2) {
            tile[i] = tile[i - 2] * tile[2];

            for (int j = i - 4; j >= 0; j -= 2) {
                tile[i] += (tile[j] * 2);
            }
        }
    }

    System.out.println(count % 2 == 0 ? tile[count] : 0);
  }
}
