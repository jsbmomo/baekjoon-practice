import java.util.Scanner;

public class bj_2577 {

  static int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int first = sc.nextInt();
    int second = sc.nextInt();
    int third = sc.nextInt();

    String multiply = String.valueOf(first * second * third);

    for (int i = 0; i < multiply.length(); i++) {
      count[multiply.charAt(i) - 48]++;
    }
    
    StringBuilder sb = new StringBuilder();

    for (int c : count) {
      sb.append(c + "\n");
    }

    sb.deleteCharAt(sb.length() - 1);

    System.out.print(sb.toString());
    sc.close();
  }
}
