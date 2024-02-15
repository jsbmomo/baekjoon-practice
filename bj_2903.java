import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2903 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final int N = Integer.parseInt(br.readLine());
    
    System.out.println((int) Math.pow(Math.pow(2, N) + 1, 2));

    br.close();
  }
}
