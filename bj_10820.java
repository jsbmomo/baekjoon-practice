import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class bj_10820 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String input = "";

    while ((input = br.readLine()) != null) {
      int len = input.length();
      int small = 0, capital = 0, number = 0, blank = 0;

      for (int i = 0; i < len; i++) {
        char ascii = input.charAt(i);
                
        if (ascii >= 'a' && ascii <= 'z') 
          small++;
        else if (ascii >= 'A' && ascii <= 'Z')
          capital++;
        else if (ascii >= '0' && ascii <= '9')
          number++;
        else
          blank++;
      }

      bw.append(small + " ").append(capital + " ").append(number + " ").append(blank + "\n");
      bw.flush();
    }
    
    bw.close();
  }
}
