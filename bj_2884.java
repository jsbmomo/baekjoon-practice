import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bj_2884 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int M = sc.nextInt();

    StringBuilder sb = new StringBuilder();

    if (M < 45) {
      H--;
      M = 60 - (45 - M);

      if (H < 0) H = 23;

      sb.append(H).append(" ").append(H);
    } else {
      sb.append(H).append(" ").append(M - 45);
    }

    System.out.println(sb.toString());
    sc.close();
  }
}
