import java.util.Scanner;

public class bj_2748 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if (num < 2) {
      System.out.println(num);
      return;
    }

    long[] ary = new long[num + 1];

    ary[0] = 0;
    ary[1] = 1;

    for (int i = 2; i <= num; i++) {
      ary[i] = ary[i - 1] + ary[i - 2];
    }

    System.out.println(ary[num]);
    sc.close();
  }
}
