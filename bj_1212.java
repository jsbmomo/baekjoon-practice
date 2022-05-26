import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_1212 {
  static StringBuilder sb = new StringBuilder();
  static String[] CASE = { "000", "001", "010", "011", "100", "101", "110", "111" };

  public static void main(String[] args) {
    try(
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {
      String input = br.readLine();

      // for (int idx = 0; idx < input.length(); idx++) {
      //   convert( input.charAt(idx) - '0' );
      // }
      
      for (int index = 0; index < input.length(); index++) {
        sb.append(CASE[input.charAt(index) - '0']);
      }

      if (input.equals("0")) {
        bw.append("0\n");
        bw.flush();
      } else {
        while (sb.charAt(0) == '0') {
          sb = new StringBuilder(sb.substring(1));
        }
        bw.append(sb.toString() + '\n');
        bw.flush();
      }
    } catch (IOException ignore) {
      // io 사용 시,  IOException
    }
  }

  // public static void convert(int octal) {
  //   switch(octal) {
  //     case 0:
  //       if (!frontJudge) {
  //         sb.append(CASE[octal]);
  //       }
  //       break;
  //     case 1:
  //       if (frontJudge) {
  //         sb.append('1');
  //         frontJudge = false;
  //       } else {
  //         sb.append(CASE[octal]);
  //       }
  //       break;
  //     case 2:
  //       if (frontJudge) {
  //         sb.append("10");
  //         frontJudge = false;
  //       } else {
  //         sb.append(CASE[octal]);
  //       }
  //       break;
  //     case 3:
  //       if (frontJudge) {
  //         sb.append("11");
  //         frontJudge = false;
  //       } else {
  //         sb.append(CASE[octal]);
  //       }
  //       break;
  //     default:
  //       sb.append(CASE[octal]);
  //   }
  // }
}
