import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_4344 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());

    StringTokenizer st = null;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < count; i++) {
      st = new StringTokenizer(br.readLine());

      int num = Integer.parseInt(st.nextToken());
      double sum = 0.0;

      int[] score = new int[num];

      for (int j = 0; st.hasMoreTokens(); j++) {
        int value = Integer.parseInt(st.nextToken());

        score[j] = value;
        sum += value;
      }

      double mean = sum / num;
      double student = 0;

      for (int j = 0; j < num; j++) {
        if (score[j] > mean) {
          student++;
        }
      }

      sb.append(String.format("%.3f%%\n", (student / num) * 100));
    }

    System.out.println(sb.toString());
    br.close();
  }
}
