import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10101 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());

    System.out.println(solution(a, b, c));

    br.close();
  }

  private static String solution(int a, int b, int c) {
    if (a + b + c != 180) return "Error";

    if (a == b && b == c) return "Equilateral";

    if (a == b || b == c || c == a) return "Isosceles";
    
    return "Scalene";
  }
}
