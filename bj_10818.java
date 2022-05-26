import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_10818 {
  static int[] values;
  static StringTokenizer token;
  static int max, min;
  static int temp;

  public static void main(String[] args) {
    try (
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {
      int count = Integer.parseInt(br.readLine());
      values = new int[count];
      token = new StringTokenizer(br.readLine());

      // for (int index = 0; index < count; index++) {
      //   values[index] = Integer.parseInt(token.nextToken());
      // }

      // max = min = values[0];
      // for (int index = 0; index < count; index++) {
      //   if (min > values[index]) {
      //     min = values[index];
      //   }
      //   if (max < values[index]) {
      //     max = values[index];
      //   }
      // }
      max = min = Integer.parseInt(token.nextToken());
      
      while (token.hasMoreTokens()) {
        temp = Integer.parseInt(token.nextToken());

        if (min > temp) {
          min = temp;
        }
        if (max < temp) {
          max = temp;
        }
      }

      bw.append(min + " " + max + "\n");
      bw.flush();
    } catch (IOException ignore) {
      // java.io.* -> need to IOException
    }
  }
}