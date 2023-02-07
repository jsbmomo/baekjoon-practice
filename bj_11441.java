import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11441 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    int[] values = new int[count];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < count; i++) {
      values[i] = Integer.parseInt(st.nextToken());
    }
    
    StringBuilder sb = new StringBuilder();
    int play = Integer.parseInt(br.readLine());
    for (int i = 0; i < play; i++) {
      String[] range = br.readLine().split(" ");
      int start = Integer.parseInt(range[0]);
      int end = Integer.parseInt(range[1]);
      int sum = 0;

      for (int j = start - 1; j < end; j++) {
        sum += values[j];
      }

      sb.append(sum).append('\n');
    }
    
    System.out.println(sb.toString());
    br.close();
  }
}
