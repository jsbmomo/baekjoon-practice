import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10826 {

  private static int[] register;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());

    register = new int[input + 1];

    System.out.println(fibonacci(input));
  }
  

  public static int fibonacci(int num) {
    if (num <= 1) return num;
    else if (register[num] != 0) return register[num];
    else return register[num] = fibonacci(num - 1) + fibonacci(num - 2);
  }
}
