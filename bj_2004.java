import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2004 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    long cnt2 = getTwo(N) - getTwo(M) - getTwo(N - M);
    long cnt5 = getFive(N) - getFive(M) - getFive(N - M);

    System.out.println( Math.min(cnt2, cnt5) );
    br.close();
  }

  public static long getFive(int num) {
    long temp = 0;
    if (num < 5) return 0;
    for (long i = 5; i <= num; i = i * 5) {
      temp = temp + (num / i);
    }
    return temp;
  }

  public static long getTwo(int num) {
    long temp = 0;
    if (num < 2) return 0;
    for (long i = 2; i <= num; i = i * 2) {
      temp = temp + (num / i);
    }
    return temp;
  }
}
