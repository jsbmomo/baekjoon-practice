import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_23351 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());;
  
    int N, K, A, B, ans = 1;
    int[] pots;

    N = Integer.parseInt(st.nextToken());
    K = Integer.parseInt(st.nextToken());
    A = Integer.parseInt(st.nextToken());
    B = Integer.parseInt(st.nextToken());
    
    pots = new int[N];
    Arrays.fill(pots, K);
      
    int index = 0;

    while(true){
      for (int i=index; i<index+A; i++) {
        pots[i % N] += B;
      }

      for (int i = 0; i < N; i++) {
        if (--pots[i] == 0) {
          System.out.println(ans);
          return;
        }
      }
      ans += 1;
      index = (index + A) % N;
    }
  }
}
