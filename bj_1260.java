import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_1260 {
  static int pointCount, lineCount, startPoint;
  static int map[][];
  static boolean[] visit;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    StringTokenizer st = new StringTokenizer(s, " ");

    pointCount = Integer.parseInt(st.nextToken());
    lineCount = Integer.parseInt(st.nextToken());
    startPoint = Integer.parseInt(st.nextToken());
    
    map = new int[pointCount + 1][pointCount + 1];
    visit = new boolean[pointCount + 1];

    for (int j = 0; j < pointCount + 1; j++) {
      Arrays.fill(map[j], 0);
    }

    Arrays.fill(visit, false);

    for (int i = 0; i < lineCount; i++) {
      String edge = br.readLine();
      StringTokenizer input = new StringTokenizer(edge, " ");
      int a = Integer.parseInt(input.nextToken());
      int b = Integer.parseInt(input.nextToken());
      map[a][b] = 1;
      map[b][a] = 1;
    }

    getDfs(startPoint);
    
    System.out.println();
    Arrays.fill(visit, false);

    getBfs(startPoint);
  }

  public static void getDfs(int value) {
    visit[value] = true;
    System.out.print(value + " ");
    for (int j = 1; j < pointCount + 1; j++) {
      if (map[value][j] == 1 && visit[j] == false) {
        getDfs(j); // 이번에 찾은 경로가 찾았던 경로면 다음으로 이동, 만약 새로운 경로면 리턴해서 돌아옴.
      }
    }
  }

  public static void getBfs(int value) {
    Queue<Integer> q = new LinkedList<Integer>();
    q.offer(value);
    visit[value] = true; // 방문한 위치를 체크
    
    while (!q.isEmpty()) {
      int temp = q.poll();
      System.out.print(temp + " ");

      for (int k = 1; k <= pointCount; k++) {
        if (map[temp][k] == 1 && visit[k] == false) {
          q.offer(k);
          visit[k] = true; // true면 방문
        }
      }
    }

  }
}
