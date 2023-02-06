import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_17289 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine());
    int[] NGE = new int[len];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < len; i++) {
      NGE[i] = Integer.parseInt(st.nextToken());
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < len; i++) {
      int max = NGE[i];
      int checkIndex = 0;

      for (int j = i + 1; j <len; j++) {
        if (NGE[j] > max) {
          max = NGE[j];
          checkIndex = j;
        }
      }

      if (NGE[i] == max) {
        sb.append("-1 ");
        continue;
      }

      
      for (int z = checkIndex - 1; z > i; z--) {
        if (NGE[z] > max) {
          max = NGE[z];
        }
      }

      sb.append(max).append(' ');
    }
    
    System.out.println(sb.toString());
    br.close();
  }
}

class CustomStack {
  private int index;
  private int[] values;

  CustomStack(int size) {
    this.index = 0;
    this.values = new int[size];
  }

  public void push(int value) {
    this.values[index++] = value;
  }

  public int pop() {
    return this.values[index--];
  }

  public void clear() {
    this.index = 0;
  }
}