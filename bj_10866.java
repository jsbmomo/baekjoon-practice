import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class bj_10866 {

  static final String[] BEHAVIOR = { "push_front", "push_back", "pop_front", "pop_back", "size", "empty", "front", "back" };
  static Deque<Integer> dq = new ArrayDeque<Integer>();

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int input = Integer.parseInt(br.readLine());

    for (int i = 0; i < input; i++) {
      programActivate(br.readLine());
    }

    br.close();
  }
  
  public static void programActivate(String command) {
    String[] divide = command.split(" ");
    
    if (divide.length > 1) {
      if (divide[0].equals(BEHAVIOR[0])) {
        dq.addFirst(Integer.parseInt(divide[1]));
      } 
      else if (divide[0].equals(BEHAVIOR[1])) {
        dq.addLast(Integer.parseInt(divide[1]));
      }
      return ;
    }

    if (command.equals(BEHAVIOR[2])) {
      if (dq.isEmpty()) {
        System.out.println("-1");
      } else {
        System.out.println(dq.removeFirst());
      }
    }
    else if (command.equals(BEHAVIOR[3])) {
      if (dq.isEmpty()) {
        System.out.println("-1");
      } else {
        System.out.println(dq.removeLast());
      }
    }
    else if (command.equals(BEHAVIOR[4])) {
      System.out.println(dq.size());
    }
    else if (command.equals(BEHAVIOR[5])) {
      if (dq.isEmpty()) {
        System.out.println("1");
      } else {
        System.out.println("0");
      }
    } 
    else if (command.equals(BEHAVIOR[6])) {
      if (dq.isEmpty()) {
        System.out.println("-1");
      } else {
        System.out.println(dq.getFirst());
      }
    }
    else if (command.equals(BEHAVIOR[7])) {
      if (dq.isEmpty()) {
        System.out.println("-1");
      } else {
        System.out.println(dq.getLast());
      }
    }
    return ;
  }
}