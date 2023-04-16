import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11005 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int decimal = Integer.parseInt(st.nextToken());
    int arithmetic = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();

    while (decimal > 0) {
      int temp = decimal % arithmetic;

      if (temp < 10) {
        sb.append(temp);
      } else {
        sb.append((char) ((temp - 10) + 'A'));
      }

      decimal /= arithmetic;
    }

    System.out.println(sb.reverse());
    br.close();
  }
}
