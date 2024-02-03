import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2003 {  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] ary = new int[N];
    for (int i = 0; i < N; i++) {
      ary[i] = Integer.parseInt(st.nextToken());
    }

    int count = 0;
    int start = 0, end = 0;
    int sum = 0;

    for (int i = start; i <= end; i++) {
      sum += ary[i];
    }

    for (int i = 0; ; i++) {
      if (sum == M) {
        count++;
        sum += ary[++end] - ary[start++];
      } 
      else if (sum < M) {
        sum += ary[++end];
      }
      else {
        sum -= ary[start];
        start++;
      }
    }

    System.out.println(count);
    br.close();
  }
}
