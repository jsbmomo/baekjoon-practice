import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1568 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());

    int bird = 0;
    int count = 0;
    
    while (num > 1) {
      if (num < bird) bird = 1;

      num -= bird;
      bird++;
      count++;
    }

    System.out.println(count);

    br.close();
  }
}
