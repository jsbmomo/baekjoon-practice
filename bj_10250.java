import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10250 {
  static BufferedReader br;
  static StringTokenizer st;
  static int count;
  static int floor;
  static int room;
  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++) {
      st = new StringTokenizer(br.readLine());
      
      int H = Integer.parseInt(st.nextToken());
      int W = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());

      int distance = (N - 1) / H + 1;
      int floor = (N - 1) % H + 1;


      // 방법 2.
      // if (N % H == 0) {
      //   floor = H * 100;
      //   room = N / H;
      // } else {
      //   floor = (N % H) * 100;
      //   room = (N / H) + 1;
      // }

      System.out.printf("%d%02d\n", floor, distance);
      // 방법 1.
      // for (int j = 1; j <= W; j++) {
      //   for (int z = 1; z <= H; z++) {
      //     if (++location == N) {
      //       floor = z;
      //       room = j;
      //       break;
      //     }
      //   }
      //   if (floor != 0) break;
      // }

      // System.out.println(String.format("%d%02d", floor, room));
      // location = floor = room = 0;
    }

    br.close();
  }
}
