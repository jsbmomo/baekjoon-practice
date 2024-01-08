import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10158 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input1 = br.readLine().split(" ");
    int w = Integer.parseInt(input1[0]);
    int h = Integer.parseInt(input1[1]);

    String[] input2 = br.readLine().split(" ");
    int p = Integer.parseInt(input2[0]);
    int q = Integer.parseInt(input2[1]);

    int time = Integer.parseInt(br.readLine());

    int timeX = time % (2 * w);
    int currentX = p;
    int deltaX = 1;

    while (timeX-- > 0) {
      if (currentX == w) deltaX = -1;
      else if (currentX == 0) deltaX = 1;
      currentX += deltaX;
    } 

    int timeY = time % (2 * h);
    int currentY = q;
    int deltaY = 1;

    while (timeY-- > 0) {
      if (currentY == h) deltaY = -1;
      else if (currentY == 0) deltaY = 1;
      currentY += deltaY;
    }

    System.out.println(currentX + " " + currentY);
    br.close();
  }
}