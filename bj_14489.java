import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14489 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    long account = Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken());
    long chicken = Long.parseLong(br.readLine()) * 2L;

    System.out.println(account >= chicken ? account - chicken : account);

    br.close();
  }
}
