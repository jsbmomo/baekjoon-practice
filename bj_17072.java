import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_17072 {
  static BufferedReader br = null;
  static BufferedWriter bw = null;
  static StringBuilder sb = null;
  static int r, g, b, multiply;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));
    sb = new StringBuilder();

    String[] range = br.readLine().split(" ");
    

    for (int i = 0; i < Integer.parseInt(range[0]); i++) {
      String[] line = br.readLine().split(" ");

      for (int j = 0; j < line.length; j += 3) {
        r = Integer.parseInt(line[j]);
        g = Integer.parseInt(line[j + 1]);
        b = Integer.parseInt(line[j + 2]);
        multiply = intensityFunction(r, g, b);

        sb.append(findAsciiCode(multiply));
      }
      sb.append('\n');
    }

    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }

  public static int intensityFunction(int r, int g, int b) {
    return (2126 * r) + (7152 * g) + (722 * b);
  }

  public static char findAsciiCode(int value) {
    if (isBetween(value, 0, 510_000)) return '#';
    else if (isBetween(value, 510_000, 1_020_000)) return 'o';
    else if (isBetween(value, 1_020_000, 1_530_000)) return '+';
    else if (isBetween(value, 1_530_000, 2_040_000)) return '-';
    else return '.';
  }

  public static boolean isBetween(int value, int lower, int upper) {
    return lower <= value && value < upper;
  }
}
