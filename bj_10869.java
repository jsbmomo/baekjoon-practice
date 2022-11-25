import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_10869 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    String[] input = br.readLine().split(" ");

    int a = Integer.parseInt(input[0]);
    int b = Integer.parseInt(input[1]);

    sb.append(a + b).append('\n');
    sb.append(a - b).append('\n');
    sb.append(a * b).append('\n');
    sb.append(a / b).append('\n');
    sb.append(a % b).append('\n');
    
    bw.append(sb.toString());
    bw.flush();
    bw.close();
    br.close();
  }
}
