import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj_3273 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int size = Integer.parseInt(br.readLine());
    final int[] num = new int[size];

    StringTokenizer st = new StringTokenizer(br.readLine());
    HashSet<Integer> set = new HashSet<>();
    
    for (int i = 0; st.hasMoreTokens(); i++) {
      num[i] = Integer.parseInt(st.nextToken());
      set.add(num[i]);
    }

    final int X = Integer.parseInt(br.readLine());
    int result = 0;

    for (int i = 0; i < size; i++) {
      if (set.contains(X - num[i])) result++;
    }

    System.out.println(result / 2);
    br.close();
  }
}
