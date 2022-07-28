import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 첫째 줄에 도시의 개수 N(1 ≤ N ≤ 20)이 주어진다. 
 * 둘째 줄부터 N개의 줄에 각각의 도시 사이에 이동하는데 필요한 시간 (≤ 10,000)이 주어진다. 
 * A에서 B로 가는 시간과 B에서 A로 가는 시간은 같다. 
 * 또, A와 B가 같은 경우에는 필요한 시간은 0이다.
 * 
 * https://steady-coding.tistory.com/105
 * 
 * 첫째 줄에 도로 개수가 최소일 때, 모든 도로의 시간의 합을 출력한다. 불가능한 경우에는 -1을 출력한다.
 * - 플로이드 와샬 알고리즘
 */
public class bj_1507 {

  static final int INF = 987654321;

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    StringTokenizer st;

    int N = sc.nextInt();
    int[][] dist = new int[N + 1][N + 1];
    int[][] arr = new int[N + 1][N + 1];
    boolean[][] check = new boolean[N + 1][N + 1];

    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(sc.next());
      for (int j = 1; j <= N; j++) {
        dist[i][j] = Integer.parseInt(st.nextToken());
        arr[i][j] = dist[i][j];
      }
    }

    for (int k = 1; k <= N; k++) {
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N; j++) {
          if (i == j || i == k || k == j) {
            continue;
          }

          if (dist[i][j] > dist[i][k] + dist[k][j]) {
            System.out.println("-1");
            return ;
          }

          if (dist[i][j] == dist[i][k] + dist[k][j]) {
            arr[i][j] = INF;
          }
        }
      }
    }

    int ans = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (arr[i][j] != INF && i != j && !check[i][j]) {
          ans += arr[i][j];
          check[i][j] = check[j][i] = true;
        }
      }
    }

    System.out.println(ans);
    sc.close();
  }
}
