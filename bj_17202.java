import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_17202 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = br.readLine();
    String b = br.readLine();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < a.length(); i++) {
      sb.append(a.charAt(i)).append(b.charAt(i));
    }

    while (true) {
      StringBuilder tempSb = new StringBuilder();

      if ((sb.length() - 2) < 1) break;

      for (int i = 0; i < sb.length() - 2; i++) {
        int v = ((sb.charAt(i) - '0') + (sb.charAt(i + 1) - '0')) % 10;
        tempSb.append((char) v);
      }
      
      sb = tempSb;
    }
    
    System.out.println(sb.toString());
  }
}
