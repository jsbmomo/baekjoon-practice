import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1550 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();
    int sum = 0;
    int hex = 1;

    for (int i = input.length - 1; i >= 0; i--) {
      sum += hexToDecimal(input[i]) * hex;
      hex *= 16;
    }

    System.out.println(sum);
  }

  public static int hexToDecimal(char c) {
    switch(c) {
      case 'A':
        return 10;
      case 'B':
        return 11;
      case 'C':
        return 12;
      case 'D':
        return 13;
      case 'E':
        return 14;
      case 'F':
        return 15;
      default:
        return c - '0';
    }
  }
}
