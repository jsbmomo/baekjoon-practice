import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2675 {
  static BufferedReader br;
  static BufferedWriter bw;
  static int count;
  static int repeatCount;
  static String repeatStr;
  static StringBuilder sb;
  static StringTokenizer st;
  static char[] strToChar;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    count = Integer.parseInt(br.readLine());
    sb = new StringBuilder();

    for (int i = 0; i < count; i++) {
      st = new StringTokenizer(br.readLine());
      repeatCount = Integer.parseInt(st.nextToken());
      repeatStr = st.nextToken();

      repeat();
    }

    System.out.println(sb.toString());
    br.close();
  }

  static void repeat() {
    strToChar = repeatStr.toCharArray();

    for (int j = 0; j < strToChar.length; j++) {
      for (int z = 0; z < repeatCount; z++) {
        sb.append(strToChar[j]);
      }
    }
    sb.append("\n");
  }
}
