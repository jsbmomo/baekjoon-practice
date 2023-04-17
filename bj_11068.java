import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11068 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int count = Integer.parseInt(br.readLine());
    
    for (int i = 0; i < count; i++) {
      int digit = Integer.parseInt(br.readLine());
      boolean ans = false;

      for (int j = 2; j <= 64; j++) {
        int[] baseDigit = convertBase(digit, j);
  
        if (isPalindrome(baseDigit)) {
          ans = true;
          break;
        }
      }

      sb.append(ans ? "1" : "0").append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }

  static int[] convertBase(int x, int base) {
    int len = 0, copyX = x;

    while(copyX > 0) {
      copyX /= base;
      len++;
    }

    int[] baseDigit = new int[len];
    len = 0;

    while(x > 0) {
      baseDigit[len++] = x % base;
      x /= base;
    }

    return baseDigit;
  }

  static boolean isPalindrome(int[] digit) {
    int digitLength = digit.length;

    for (int i = 0; i < digitLength / 2; i++) {
      if (digit[i] != digit[digitLength - i - 1])
        return false;
    }

    return true;
  }
}
