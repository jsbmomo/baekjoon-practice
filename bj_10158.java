import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10158 {
  static int w, h, p, q;
  static int time;
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input1 = br.readLine().split(" ");
    w = Integer.parseInt(input1[0]);
    h = Integer.parseInt(input1[1]);

    String[] input2 = br.readLine().split(" ");
    p = Integer.parseInt(input2[0]);
    q = Integer.parseInt(input2[1]);

    time = Integer.parseInt(br.readLine());

    int moveX = 1, moveY = 1;

    while (--time >= 0) {
      p += moveX;
      q += moveY;
      if (p == 0 || p == w) moveX *= -1;
      if (q == 0 || q == h) moveY *= -1;
    }

    System.out.println();
    br.close();
  }
}