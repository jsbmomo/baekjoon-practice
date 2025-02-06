import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9728 {
  
  private static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int given = Integer.parseInt(br.readLine());
    
    StringTokenizer targetInput;
    int success;

    for (int i = 1; i <= given; i++) {
      targetInput = new StringTokenizer(br.readLine());
      success = 0;

      int count = Integer.parseInt(targetInput.nextToken());
      int sum = Integer.parseInt(targetInput.nextToken());

      String[] values = br.readLine().split(" ");

      for (String value : values) {
        
      }

      appendResult(i, success);
    }
    

    System.out.println(sb.toString());

    br.close();
  }
      
  private static void appendResult(int index, int value) {
    sb.append("Case #").append(index).append(" :  ").append(value);
  }

}
