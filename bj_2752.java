import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj_2752 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] input = new int[st.countTokens()];
    
    for (int i = 0; i < input.length; i++) {
      input[i] = Integer.parseInt(st.nextToken());
    }

    int[] input2 = {2,39,14,10,12,9,45,16,35,26,38,4,6,15,23,41,50,48,66,43};
    
    // Arrays.sort(input);
    quickSort(input2, 0, input2.length - 1);

    for (int val : input) {
      bw.append(val + " ");
    }

    bw.flush();
    bw.close();
    br.close();
  }

  public static void quickSort(int[] ary, int left, int right) {
    IntStack lStack = new IntStack(right - left + 1);
    IntStack rStack = new IntStack(right - left + 1);

    lStack.push(left);
    rStack.push(right);

    int counter = 1;

    while (!lStack.isEmpty()) {
      int pointerLeft = left = lStack.pop();
      int pointerRight = right = rStack.pop();
      int pivot = ary[(left + right) / 2];

      do {
        while (ary[pointerLeft] < pivot) {
          System.out.println("Loop : " + counter + " / " + ary[pointerLeft] + " / " + pivot);
          pointerLeft++;
        }
        while (ary[pointerRight] > pivot) {
          pointerRight--;
        }

        if (pointerLeft <= pointerRight) {
          swap(ary, pointerLeft++, pointerRight--);
        }
      } while (pointerLeft <= pointerRight);

      if (left < pointerRight) {
        lStack.push(left);
        rStack.push(pointerRight);
      }

      if (pointerRight < right) {
        lStack.push(pointerLeft);
        rStack.push(right);
      }

      counter++;
    }
  }

  public static void swap(int[] ary, int a, int b) {
    int tmp = ary[b];
    ary[b] = ary[a];
    ary[a] = tmp;
  }
}


class IntStack {
  private int[] stack;
  private int pointer;
  private int max;

  public IntStack(int capacity) {
    pointer = 0;
    max = capacity;
    stack = new int[max];
  }

  public int pop() {
    if (pointer <= 0) throw new EmptyIntStackException("The stack is Empty !!!");
    return stack[pointer - 1];
  }

  public int peek(int search) {
    for (int i = pointer - 1; pointer >= 0; i--) {
      if (stack[i] == search)
        return i;
    }
    return -1;
  }

  public int push(int data) {
    if (pointer >= max) throw new OverflowIntStackException("The stack is Full !!!");
    return stack[pointer++] = data;
  }

  public void clear() {
    pointer = 0;
  }

  public int size() {
    return pointer;
  }

  public boolean isEmpty() {
    return pointer == 0 ? true : false;
  }

  public class EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() {}
    public EmptyIntStackException(String message) {
      super(message);
    }
  }

  public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException() {}
    public OverflowIntStackException(String message) {
      super(message);
    }
  }
}
