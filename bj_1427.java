import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1427 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    int[] values = new int[input.length()];

    for (int i = 0; i < input.length(); i++) {
      values[i] = input.charAt(i) - '0';
    }

    pivotSort(values, 0, values.length);

    StringBuilder sb = new StringBuilder();

    for (int value : values) {
      sb.append(value);
    }

    sb.append('\n');

    System.out.println(sb.toString());
    br.close();
  }

  static void pivotSort(int[] ary, int low, int high) {
    if (low > high) return;

    int pivot = partition(ary, low, high);

    pivotSort(ary, low, pivot - 1);
    pivotSort(ary, pivot + 1, high);
  }

  static int partition(int[] ary, int left, int right) {
    int low = left;
    int high = right;
    int pivot = ary[right];

    while (low < high) {
      while(ary[low] < pivot && low < high) {
        low++;
      }

      while(ary[high] >= pivot && low < high) {
        high--;
      }

      swap(ary, low, high);
    }

    swap(ary, right, high);

    return high;
  }

  static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
}
