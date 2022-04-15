import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11655 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder(br.readLine());
    StringBuilder result = new StringBuilder();

    int cnt = sb.length();
    
    for (int i = 0; i < cnt; i++) {
      char c = sb.charAt(i);
      int convert = (int) c - 13;
      int rot;

      if (convert >= 65 && convert <= 90) {
        rot = (convert + 13) > 90 ? (convert - 90) + 65 : convert;
        System.out.println(1);
      } else if (convert >= 97 && convert <= 122) {
        rot = (convert + 13) > 122 ? (convert - 122) + 97 : convert;
        System.out.println(2);
      } else {
        rot = convert;
        System.out.println(3);
      }
      System.out.println((char) rot + "   " + rot);
      result.append((char) rot);
    }

    System.out.println(result);
  }
  
}
