import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_1284 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while(true) {
      String input = br.readLine();
      int count = 0;

      if (input.equals("0")) break;

      count++;
      for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == '1') count += 3;
        else if (input.charAt(i) == '0') count += 5;
        else count += 4;
      }

      bw.append(String.valueOf(count)).append("\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
