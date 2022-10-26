import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class bj_2822 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int quiz = 8;
    int[] num = new int[quiz];
    int[] max = new int[quiz];

    for (int i = 0; i < quiz; i++) {
      num[i] = Integer.parseInt(br.readLine());
      max[i] = num[i];
    }

    Arrays.sort(max);

    int sum = 0;
    for (int i = 3; i < quiz; i++) {
      sum += max[i];
    }
    bw.append(sum + "\n");

    for (int i = 0; i < quiz; i++) {
      for (int j = 3; j < quiz; j++) {
        if (num[i] == max[i]) {
          bw.append(i + 1 + " ");
        }
      }
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
