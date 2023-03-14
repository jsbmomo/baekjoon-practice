import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2920 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count = 8;
    int[] ary = new int[count];

    for (int i = 0; i < count; i++) {
      ary[i] = Integer.parseInt(st.nextToken());
    }

    boolean asc = true;
    boolean desc = true;
    for (int i = 0; i < count - 1; i++) {
      if (ary[i + 1] > ary[i]) {
        desc = false;
      }

      if (ary[i + 1] < ary[i]) {
        asc = false;
      }
    }

    if (asc) {
      System.out.println("ascending");
    } else if (desc) {
      System.out.println("descending");
    } else {
      System.out.println("mixed");
    }

    br.close();
  }
}
