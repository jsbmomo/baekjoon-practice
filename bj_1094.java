import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1094 {
  public static void main(String[] args) throws IOException {
    BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine());
    int count = 0;
    int stick = 64;

    while (len > 0) {

      if (stick > len) stick /= 2;
      else {
        count++;
        len -= stick;
      }
    }
    
    System.out.println(count);

    br.close();
  }
}
