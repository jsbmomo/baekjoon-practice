import java.util.Scanner;

public class bj_2444 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    

    int line  = sc.nextInt();

    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= line; i++) {
      for (int j = 0; j < line - i; j++) {
        sb.append(" ");
      }
      for (int z = 0; z < i * 2 - 1; z++) {
        sb.append("*");
      }
      sb.append("\n");
    }

    for (int i = line - 1; i >= 0; i--) {
      for (int j = 0; j < line - i; j++) {
        sb.append(" ");
      }
      for (int z = 0; z < i * 2 - 1; z++) {
        sb.append("*");
      }
      sb.append("\n");
    }

    System.out.println(sb.toString());
    sc.close();
  }
}
