import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_10953 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    int count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++) {
      String[] inputs = br.readLine().split(",");

      int sum = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]);

      sb.append(sum).append("\n");
    }
    
    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }

}
