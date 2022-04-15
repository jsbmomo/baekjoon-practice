import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11655 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder(br.readLine());
    StringBuilder rot13 = new StringBuilder();

    int cnt = sb.length();
    
    for (int i = 0; i < cnt; i++) {
      int convert = (int) sb.charAt(i);

      if (convert >= 65 && convert <= 90) {
        rot13.append( (char) ((convert += 13) > 90 ? (convert - 90) + 64 : convert) );
      } else if (convert >= 97 && convert <= 122) {
        rot13.append( (char) ((convert += 13) > 122 ? (convert - 122) + 96 : convert) );
      } else {
        rot13.append( (char) convert );
      }
    }

    System.out.println(rot13);
  }
  
}
