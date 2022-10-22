import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10867 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    int[] plusNum = new int[1001];
    int[] minusNum = new int[1001];

    String[] ary = br.readLine().split(" ");
    StringBuffer buffer = new StringBuffer();

    for (int i = 0; i < count; i++) {
      int num = Integer.parseInt(ary[i]);

      if (num >= 0) {
        plusNum[num] = 1;
      } else {
        minusNum[num * -1] = 1;
      }
    }
    
    for (int i = 1000; i >= 0; i--) {
      if (minusNum[i] > 0)
        buffer.append(-i + " ");
    }

    for (int i = 0; i < 1001; i++) {
      if (plusNum[i] > 0)
        buffer.append(i + " ");
    }

    System.out.println(buffer);
  }
}
