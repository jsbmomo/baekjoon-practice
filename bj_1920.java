import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1920 {
  static int N, M;
  static int[] aryN, aryM;

  public static void main(String[] args) throws IOException {
    inputs();
    solution();
  }

  static void solution() {
    Arrays.sort(aryN);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < M; i++) {
      int result = search(aryM[i]);

      sb.append(result > -1 ? "1\n" : "0\n");
    }

    System.out.println(sb.toString());
  }

  // index를 반환하여 return 값이 "0"일 수 있음!
  static int search(int target) {
    int left = 0;
    int right = aryN.length - 1;

    for (int i = left; i <= right; i++) {
      int mid = (left + right) / 2;

      if (target < aryN[mid]) {
        right = mid - 1;
      } 
      else if (target > aryN[mid]) {
        left = mid + 1;
      } 
      else {
        return mid;
      }
    }

    return -1;
  }

  static void inputs() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    aryN = new int[N];

    for (int i = 0; i < N; i++) {
      aryN[i] = Integer.parseInt(st.nextToken());
    }

    M = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    aryM = new int[M];

    for (int i = 0; i < M; i++) {
      aryM[i] = Integer.parseInt(st.nextToken());
    }

    br.close();
  }
}
