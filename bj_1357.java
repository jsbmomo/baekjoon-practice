import java.util.Scanner;

public class bj_1357 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    int reverseA = reverse(a);
    int reverseB = reverse(b);

    System.out.println(reverse(String.valueOf(reverseA + reverseB)));

    sc.close();
  }

  public static int reverse(String param) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < param.length(); i++) {
      sb.append(param.charAt(param.length() - 1 - i));
    }
    return Integer.parseInt(sb.toString());
  }
}
