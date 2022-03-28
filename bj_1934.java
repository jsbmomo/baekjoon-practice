import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1934 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt = Integer.parseInt(br.readLine());
    String[] splitInput = new String[2];
    int[] result = new int[cnt];

    for (int i = 0; i < cnt; i++) {
      String str = br.readLine();
      splitInput = str.split(" ");
      
      result[i] = lcm(Integer.parseInt(splitInput[0]), Integer.parseInt(splitInput[1]));
    }
    
    for (int r : result) {
      System.out.println(r);
    }
  }

  public static int gcd(int a, int b) {
    while (b != 0) {
      int temp = a % b;
      a = b;
      b = temp;
    }

    return a;
  }

  public static int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }

}
