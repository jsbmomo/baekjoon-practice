import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1550 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] input = br.readLine().toCharArray();

    for (int i = 0; i < input.length; i++) {
      System.out.print(hexToDecimal(input[i]));
    }
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
