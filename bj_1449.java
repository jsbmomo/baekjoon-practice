import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1449 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int hole = Integer.parseInt(st.nextToken());
    int tape = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());

    int count = hole / tape;

    if ((hole % tape) > 0) count++;

    System.out.println(count);

    br.close();
  }
}
