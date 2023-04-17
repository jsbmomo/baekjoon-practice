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
        int[] baseDigit = new int[20];
        int baseLength = convertBase(digit, j, baseDigit);
  
        if (isPalindrome(baseDigit, baseLength)) {
          ans = true;
          break;
        }
      }

      sb.append(ans ? "1" : "0").append("\n");
    }

    System.out.println(sb.toString());
    br.close();
  }

  static int convertBase(int x, int base, int[] reverseDigit) {
    int len = 0;

    while(x > 0) {
      reverseDigit[len++] = x % base;
      x /= base;
    }

    return len;
  }

  static boolean isPalindrome(int[] digit, int length) {
    for (int i = 0; i < length / 2; i++) {
      if (digit[i] != digit[length - i - 1])
        return false;
    }

    return true;
  }
}
