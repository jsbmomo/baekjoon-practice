import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11283 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char input = br.readLine().charAt(0);

    System.out.println(((int) input) - 44031); 
  }
}
