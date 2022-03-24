import java.io.BufferedReader;
import java.io.InputStreamReader;


public class bj_11005 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder str = new StringBuilder();
    int value = Integer.parseInt(br.readLine());
    int notation = Integer.parseInt(br.readLine());

    while (value > 0) {
      int remain = value % notation;
      
      if (remain >= 10) {
        str.append((char) (remain - 10));
      } else {
        str.append((char) remain);    
      }
      
      value /= notation;
    }
    
    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }  
  }
}
