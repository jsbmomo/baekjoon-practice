import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10973 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    int[] number = new int[count];

    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < count; i++) {
      number[i] = Integer.parseInt(st.nextToken());
    }

    System.out.println(sb.toString());
  }

  static void swap(int[] ary, int i, int j) {
    int temp = ary[i];
    ary[i] = ary[j];
    ary[j] = temp;
  }
}
