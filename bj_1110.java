import java.util.Scanner;

public class bj_1110 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int input = sc.nextInt();
    int cycle = 1;
    int temp = input;
    
    while (true) {
      int pre = temp / 10; // 앞 자리
      int suf = temp % 10; // 뒷 자리
      int cal = 0;

      cal = (suf * 10) + ((pre + suf) % 10);

      if (cal == input) break;

      temp = cal;
      cycle++;
    }

    System.out.println(cycle);

    sc.close();
  }
}
