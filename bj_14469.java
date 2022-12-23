import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14469 {
  static int[][] cows;
  static BufferedReader br;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    cows = new int[n][2];

    for (int i = 0; i < cows.length; i++) {
      st = new StringTokenizer(br.readLine());
      cows[i][0] = Integer.parseInt(st.nextToken());
      cows[i][1] = Integer.parseInt(st.nextToken());
    }

    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (cows[j][0] > cows[j + 1][0]) {
          swap(j, j + 1);
        }
      }
    }
    
    int now = 0;
    for (int[] cow : cows) {
      if (cow[0] >= now) {
        now += cow[0] - now;
      }
      now += cow[1];
    }

    System.out.println(now);
  }

  public static void swap(int index1, int index2) {
    int[] temp = new int[2];
    temp = cows[index1];
    cows[index1] = cows[index2];
    cows[index2] = temp;
  }
}
