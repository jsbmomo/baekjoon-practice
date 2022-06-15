import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_10991 {
  public static void main(String[] args) throws IOException { 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int line = Integer.parseInt(br.readLine());
    int print = 1; 
    boolean star = true;

    for (int i = 1; i <= line; i++) {
      for (int z = line - i; z > 0; z--) {
        bw.append(" ");
      }
      for (int j = 0; j < print; j++) {
        if (star) {
          bw.append("*");
          star = false;
        }
        else {
          bw.append(" ");
          star = true;
        }
      }
      print += 2;
      star = true;
      bw.append("\n");
    }

    bw.append("\n");
    bw.flush();
    bw.close();
    br.close();
  }
}
