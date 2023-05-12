import java.util.Scanner;

public class bj_15650 {
  static int[] ary;
  static int N, M;
  static StringBuilder sb;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    sb = new StringBuilder();

    N = sc.nextInt();
    M = sc.nextInt();

    ary = new int[M];

    dfs(1, 0);

    System.out.println(sb.toString());
    sc.close();
  }

  static void dfs(int at, int depth) {
    if (depth == M) {
      for (int val : ary) {
        sb.append(val + " ");
      }
      sb.append("\n");

      return;
    }

    for (int i = at; i <= N; i++) {
      ary[depth] = i;
      dfs(i + 1, depth + 1);
    }
  }
}