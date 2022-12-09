import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_16204 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");

    int N = Integer.parseInt(inputs[0]);
    int M = Integer.parseInt(inputs[1]);
    int K = Integer.parseInt(inputs[2]);

    int ans = Math.min(M, K) + Math.min(N - M, N - K);
    
    System.out.println(ans);

    br.close();
  }
}
