import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_6359 {
  static boolean[] room;
  static int count;
  static int result;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());

    for (int i = 0; i < testCase; i++) {
      count = Integer.parseInt(br.readLine());
      room = new boolean[count + 1];
      result = 0;

      for (int j = 1; j <= count; j++) {
        for (int z = j; z < count + 1; z += j) {
          room[z] = !room[z];
        }
      }

      for (int j = 1; j < count + 1; j++) {
        if (room[j]) result++;
      };

      System.out.println(result);
    }
  }
}
