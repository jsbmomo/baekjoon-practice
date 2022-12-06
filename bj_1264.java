import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1264 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String input = br.readLine();

      if (input.equals("#")) break;
      
      int count = 0;

      input = input.toLowerCase();

      for (int i = 0; i < input.length(); i++) {
        switch (input.charAt(i)) {
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':
            count++;
        }
      }

      System.out.println(count);
    }
    
    br.close();
  }
}
