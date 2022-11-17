import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_3009 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[][] location = new int[3][2];
    int x;
    int y;
    
    for (int[] loc : location) {
      String[] value = br.readLine().split(" ");
      loc[0] = Integer.parseInt(value[0]);
      loc[1] = Integer.parseInt(value[1]);
    }

    if (location[0][0] == location[1][0] ) {
      x = location[2][0];
    } else if (location[0][0] == location[2][0]) {
      x = location[1][0];
    } else {
      x = location[0][0];
    }

    if (location[0][1] == location[1][1] ) {
      y = location[2][1];
    } else if (location[0][1] == location[2][1]) {
      y = location[1][1];
    } else {
      y = location[0][1];
    }

    StringBuilder sb = new StringBuilder();
    sb.append(x);
    sb.append(' ');
    sb.append(y);

    System.out.println(sb.toString());
    
    br.close();
  }
}
