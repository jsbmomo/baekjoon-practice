import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2908 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] values = br.readLine().split(" ");
    int[] reverseInt = new int[2];
    
    for (int index = 0; index < 2; index++) {
      String reverse = "";
      for (int i = values[index].length() - 1; i >= 0; i--) {
        reverse += values[index].charAt(i);
      }
      reverseInt[index] = Integer.parseInt(reverse);
    }
    
    System.out.println(reverseInt[0] > reverseInt[1] ? reverseInt[0] : reverseInt[1]);

    /** Method 1. */
    // StringTokenizer st = new StringTokenizer(br.readLine());
    // StringBuilder sb = new StringBuilder(st.nextToken());
    
    // int a = Integer.parseInt(sb.reverse().toString());

    // sb = new StringBuilder(st.nextToken());
    // int b = Integer.parseInt(sb.reverse().toString());

    /** Method 2. */
    // StringBuilder sb = new StringBuilder();
    // a = Integer.parseInt(sb.append(a).reverse().toString());

    // sb = new StringBuilder();
    // b = Integer.parseInt(sb.append(b).reverse().toString());

    // System.out.println(a > b ? a : b);
  }
}
