import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_25755 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    char direction = st.nextToken().charAt(0);
    int len = Integer.parseInt(st.nextToken());
    int[][] ary = new int[len][len];

    for (int i = 0; i < len; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < len; j++) {
        ary[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    
    StringBuilder sb = new StringBuilder();
    
    if (direction == 'L' || direction == 'R') {
      for (int i = 0; i < len; i++) {
        for (int j = len - 1; j >= 0; j--) {
          sb.append(mirror(ary[i][j])).append(' ');
        }
        sb.append('\n');
      }
    }

    if (direction == 'U' || direction == 'D') {
      for (int i = len - 1; i >= 0; i--) {
        for (int j = 0; j < len; j++) {
          sb.append(mirror(ary[i][j])).append(' ');
        }
        sb.append('\n');
      }
    }
    
    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }

  private static char mirror(int num) {
    switch(num) {
      case 1:
        return '1';
      case 2:
        return '5';
      case 5:
        return '2';
      case 8:
        return '8';
      default:
        return '?';
    }
  }
}