import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* recommand : charAt(index) or split("") */
public class bj_10808 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder str = new StringBuilder();
    String input = br.readLine();

    int[] count = new int[26];

    for(int idx = 0; idx < input.length(); idx++){
      count[input.charAt(idx)-97]++;
    }
    
    for(int cnt : count) {
      str.append(cnt);
      str.append(" ");
    }
    
    System.out.println(str);

    br.close();
  }

}


