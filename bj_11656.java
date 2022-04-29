import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11656 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] strSplit = input.split(" ");
    int len = strSplit[0].length();
    String[] suffix = new String[len];
    

    for (int idx = 0; idx < len; idx++) {
      suffix[idx] = input.substring(idx, len);
    }

    for (int i = 0; i < len - 1; i++) {
      String temp;
      for (int j = i + 1; j < len; j++) {
        if (suffix[i].charAt(0) > suffix[j].charAt(0)) {
          temp = suffix[i];
          suffix[i] = suffix[j];
          suffix[j] = temp;
        }
      }
    }

    for (int index = 0; index < len; index++) {
      System.out.println(index + " : " + suffix[index]);
    }
  }
  
}
