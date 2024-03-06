import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11382 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    // 10의 12승이 값으로 들어옴!
    System.out.println(
      Long.parseLong(st.nextToken()) + 
      Long.parseLong(st.nextToken()) + 
      Long.parseLong(st.nextToken())
    );

    br.close();
  }
}
