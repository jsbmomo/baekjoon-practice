import java.io.BufferedReader;
import java.io.InputStreamReader;


public class bj_11005 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder str = new StringBuilder();
    String[] strs = br.readLine().split(" ");
    int value = Integer.parseInt(strs[0]);
    int notation = Integer.parseInt(strs[1]);

    while (value > 0) {
      int remain = value % notation;
      
      System.out.println("hi");
      if (remain >= 10) {
        str.append((char) (remain - 10 + 'A'));
      } else {
        str.append((char) (remain + '0'));    
      }
      
      value /= notation;
    }
    
    for (int i = str.length() - 1; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }  
  }
}
