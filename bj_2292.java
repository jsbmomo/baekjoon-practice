import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2292 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int N = Integer.parseInt(br.readLine());
    int range = 1, move = 1;

    if (N != 1) {
      while (range < N) {
        range += (move++ * 6);
      }
    }

    System.out.println(move);
    br.close();
  }
}
