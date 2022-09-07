import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_11365 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String input = "";
    StringBuilder sb = null;

    while (true) {
      input = br.readLine();
      
      if ("END".equals(input)) break;

      sb = new StringBuilder();

      for (int i = 0; i < input.length(); i++) {
        sb.append(input.charAt(input.length() - 1 - i));
      }
      sb.append("\n");

      bw.append(sb.toString());
    }

    bw.flush();
    bw.close();
    br.close();
  }
}