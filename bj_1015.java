import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class bj_1015 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(br.readLine());

    ArrayList<Item1015> arrayList = new ArrayList<>();

    Collections.sort(arrayList, new Comparator<Item1015>() {
      @Override
      public int compare(Item1015 o1, Item1015 o2) {
        if (o1.value < o2.value) {
          return -1;
        } else if (o1.value > o2.value) {
          return 1;
        } else {
          return o1.index < o2.index ? -1 : 1;
        }
      }
    });

    
    StringBuilder sb = new StringBuilder();

    for (Item1015 item : arrayList) {
      sb.append(item.index).append(" ");
    }

    System.out.println(sb.toString());
    br.close();
  }
}

class Item1015 {
  int index;
  int value;

  Item1015(int index, int value) {
    this.index = index;
    this.value = value;
  }

  @Override
  public String toString() {
    return "index: " + index + ", value: " + value;
  }
}