import java.io.IOException;
import java.util.Scanner;

public class bj_17103 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    boolean[] isNotPrime;

    isNotPrime = makeIsPrimeTable();

    int testCastCount = sc.nextInt();

    for (int i = 0; i < testCastCount; i++) {
      int number = sc.nextInt();
      int result = 0;

      for (int j = 2; j <= number / 2; j++) {
        if (!isNotPrime[j] && !isNotPrime[number - j]) {
          result++;
        }
      }

      System.out.println(result);
    }

    sc.close();
  }

  public static boolean[] makeIsPrimeTable() {
    boolean[] isNotPrime = new boolean[1000001];

    for (int i = 2; i <= 1000000; i++) {
      if (!isNotPrime[i]) {
        for (int j = i + 2; j <= 1000000; j += i) {
          isNotPrime[j] = true;
        }
      }
    }

    return isNotPrime;
  }
}
