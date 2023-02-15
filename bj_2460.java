import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2460 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int person = 0;
    int max = 0;

    for (int i = 0; i < 10; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int out = Integer.parseInt(st.nextToken());
      int in = Integer.parseInt(st.nextToken());

      person -= out;
      person += in;

      if (person > max) max = person;
    }

    System.out.println(max);
    br.close();
  }
}
