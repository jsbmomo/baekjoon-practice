import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_1212 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    char[] input = br.readLine().toCharArray();
    
    for (char c : input) {
      int num = Character.getNumericValue(c);
      if ((num - 4) > 0) {
        bw.append('1');
        num -= 4;
      } else {
        bw.append('0');
      }

      if ((num - 2) > 0) {
        bw.append('1');
        num -= 2;
      } else {
        bw.append('0');
      }

      if (num > 0) {
        bw.append('1');
      } else {
        bw.append('0');
      }
    }
    bw.append('\n');

    bw.flush();
    br.close();
    bw.close();
  }
}
