import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class bj_2643 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int paperCount = Integer.parseInt(br.readLine());

    int[][] paper = new int[paperCount][2];
    int[] cache = new int[paperCount];
    int max = 0;

    for (int x = 0; x < paperCount; x++){
      StringTokenizer st = new StringTokenizer(br.readLine()," ");

      int temp = Integer.parseInt(st.nextToken());
      int temp2 = Integer.parseInt(st.nextToken());

      if (temp < temp2) {
        int temp3 = temp;
        temp = temp2;
        temp2 = temp3;
      }

      paper[x][0] = temp;
      paper[x][1] = temp2;
    }

    Arrays.sort(paper, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if(o1[0] == o2[0])
          return o1[1] - o2[1];
        else
          return o1[0] - o2[0];
      }
    });

    for (int x = 0; x < paperCount; x++){
      cache[x] = 1;

      for (int y = 0; y < x; y++) {
        if (paper[y][0] <= paper[x][0] && paper[y][1] <= paper[x][1] && cache[x] < cache[y] + 1)
          cache[x] = cache[y] + 1;
      }

      if (max < cache[x])
        max = cache[x];
    }

    bw.write(String.valueOf(max));

    bw.flush();
    br.close();
    bw.close();
  }
}