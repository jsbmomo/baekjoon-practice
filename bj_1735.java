import java.util.Scanner;

public class bj_1735 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int c1 = scan.nextInt();
    int p1 = scan.nextInt();
    int c2 = scan.nextInt();
    int p2 = scan.nextInt();

    c1 = c1 * p2 + c2 * p1;
    p1 = p1 *p2;

    int gcd = getGcd(c1, p1);

    System.out.printf("%d %d", c1/gcd, p1/gcd);

    scan.close();
  }

  static int getGcd(int a, int b) {
    if (a % b == 0) return b;

    return getGcd(b, a % b);
  }
}
