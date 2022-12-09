import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1330 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inputs = br.readLine().split(" ");

    int A = Integer.parseInt(inputs[0]);
    int B = Integer.parseInt(inputs[1]);
    
    System.out.println(A == B ? "==" : A > B ? ">" : "<");
  }
}
