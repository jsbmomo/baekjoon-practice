import java.util.Scanner;

public class bj_12756 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int aAttack = sc.nextInt();
    int aHP = sc.nextInt();
    
    int bAttack = sc.nextInt();
    int bHP = sc.nextInt();

    while(true) {
      aHP -= bAttack;
      bHP -= aAttack;

      if (bHP <= 0 && aHP >= 1) {
        System.out.println("PLAYER A");
        break;
      } else if(aHP <= 0&& bHP >= 1) {
        System.out.println("PLAYER B");
        break;
      } else if(aHP <= 0 && bHP <= 0) {
        System.out.println("DRAW");
        break;
      }
    }

    sc.close();
  }
}
