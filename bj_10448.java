import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10448 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    int[] triangleArray = new int[45];

    for (int i = 1; i < 45; i++) {
      triangleArray[i] = i * (i + 1) / 2;
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(br.readLine());
      int result = judgeEureka(num, triangleArray);
      sb.append(result).append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }

  static int judgeEureka(int num, int[] triangleArray) {
    for (int i = 1; i < 45; i++) {
      for (int j = 1; j < 45; j++) {
        for (int k = 1; k < 45; k++) {
          int sum = triangleArray[i] + triangleArray[j] + triangleArray[k];

          if (sum == num) {
            return 1;
          }
        }
      }
    }

    return 0;
  }
}
