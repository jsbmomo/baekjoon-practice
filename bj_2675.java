import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2675 {
  static BufferedReader br;
  static BufferedWriter bw;
  static int count;
  static int repeatCount;
  static String repeatStr;
  static StringBuilder sb;
  static String[] input;
  static char[] strToChar;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));
    count = Integer.parseInt(br.readLine());
    sb = new StringBuilder();

    for (int i = 0; i < count; i++) {
      input = br.readLine().split(" ");
      repeatCount = Integer.parseInt(input[0]);
      repeatStr = input[1];

      repeat();
    }

    bw.append(sb.toString());
    bw.flush();
    bw.close();
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
