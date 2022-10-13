import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2491 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(br.readLine());
    int up = 0;
    int upMax = 0;
    int down = 0;
    int downMax = 0;
    int defore = 0;
    boolean isUp = false;

    StringTokenizer st = new StringTokenizer(br.readLine());
    
    while(st.hasMoreTokens()) {
      int temp = Integer.parseInt(st.nextToken());

      if (defore < temp) {
        if (downMax < down && down != 0) {
          downMax = down;
        }
        down = 0;
        up++;
        isUp = true;
      } else if (defore > temp) {
        if (upMax < up && up != 0) {
          upMax = up;
        }
        up = 0;
        down++;
        isUp = false;
      } else if (defore == temp) {
        if (isUp) {
          up++;
        } else {
          down++;
        }
      }

      if (upMax < up) {
        upMax = up;
      }
      if (downMax < down) {
        downMax = down;
      }
      
      System.out.println(downMax + "  " + upMax);
      defore = temp;
    }

    System.out.println(Math.max(upMax, downMax));
  }
}
