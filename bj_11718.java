import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bj_11718 {
  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    while (true) {
      String temp = br.readLine();

      if (temp == null || temp.isEmpty()) {
        break;
      }

      sb.append(temp).append('\n');
    }

    br.close();
    System.out.println(sb);
  }
}
