import java.util.Scanner;

/**
 * 백준 1977. 완전제곱수 구하기
 */
public class bj_1977 {
  static int[] ary;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();

    int min = (int) Math.ceil(Math.sqrt(m)); // 올림, 루트
    int sum = 0;

    for (int i = min; i <= Math.floor(Math.sqrt(n)); i++) { // 내림, 루트
      sum += Math.pow(i, 2);
    }

    if (sum > 0 ) {
      System.out.println(sum);
      System.out.println((int) Math.pow(min, 2)); // 제곱
    } else {
      System.out.println(-1);
    }

    sc.close();
  }
}
