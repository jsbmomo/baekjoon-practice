import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_1212 {

  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    char[] input = br.readLine().toCharArray();

    convert(input[0], true);

    for (int idx = 1; idx < input.length; idx++) {
      convert(input[idx], false);
    }

    bw.append(sb.toString() + '\n');
    bw.flush();
    br.close();
    bw.close();
  }

  public static void convert(char octal, boolean firstChar) {
    int num = octal - 48;
    int binary = 4; // 8진수를 2진수로 바꾸려면, 4 2 1 순으로 나눠야합니다.
    for (int j = 2; j >= 0; j--) {
      if ((num / binary) > 0 && num != 0) {
        num -= binary;
        sb.append('1');
      } else {
        if (!firstChar) {
          sb.append('0');
        } 
      }
      binary /= 2;
    }
  }
}
