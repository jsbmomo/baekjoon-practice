import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class bj_11576 {

  static Stack<Integer> stack = new Stack<>();

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int now = sc.nextInt();
    int future = sc.nextInt();
    int count = sc.nextInt();
    int decimal = 0;
  
    for (int i = 0; i < count; i++) {
      int x = sc.nextInt();
      decimal = decimal * now + x;
    }

    while (decimal != 0) {
      int r = decimal % future;
      decimal /= future;
      stack.push(r);
    }

    int size = stack.size();

    for (int i = 0; i < size; i++) {
      if (i == size - 1) {
        System.out.print(stack.pop());
      } else {
        System.out.print(stack.pop() + " ");
      }
    }

    sc.close();
  }
}
