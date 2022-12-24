import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_2744 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    String inputs = br.readLine();

    for (char input : inputs.toCharArray()) {
      if (input >= 'a' && input <= 'z') {
        sb.append((char) (input - 32));
      } else {
        sb.append((char) (input + 32));
      }
    }
    
    bw.write(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
