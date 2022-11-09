import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2979 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int first = 101;
    int last = 0;

    int[][] truck = new int[3][2];
    int[] ary = new int[100];
    int fee = 0;

    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());

      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      truck[i][0] = start;
      truck[i][1] = end;

      for (int j = start; j < end; j++) {
        ary[j]++;
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 2; j++) {
        if (truck[i][j] < first) first = truck[i][j];
        if (truck[i][j] > last) last = truck[i][j];
      }
    }

    for (int i = first; i < last; i++) {
      fee += (ary[i] == 1) ? ary[i] * a : 0;
      fee += (ary[i] == 1) ? ary[i] * b : 0;
      fee += (ary[i] == 1) ? ary[i] * c : 0;
    }

    System.out.println(fee);
    br.close();
  }
}
