import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2750_2 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int count = st.countTokens();
    int[] ary = new int[count];

    for (int i = 0; i < count; i++) {
      ary[i] = Integer.parseInt(st.nextToken());
    }
    
    new CustomQuickSort(ary);
    
    for (int value : ary) {
      System.out.println(value);
    }
  }
}


class CustomQuickSort {
  public CustomQuickSort(int[] ary) {
    sort(ary, 0, ary.length - 1);
  }

  public static void sort(int[] ary, int low, int high) {
    if (low >= high) return;

    int mid = partition(ary, low, high);
    sort(ary, low, mid - 1);
    sort(ary, mid, high);
  }

  private static int partition(int[] ary, int low, int high) {
    int pivot = ary[(low + high) / 2];

    while (low <= high) {
      while (ary[low] < pivot) low++;
      while (ary[high] > pivot) high--;
      if (low <= high) {
        swap(ary, low, high);
        low++;
        high--;
      }
    }
    return low;
  }

  private static void swap(int[] ary, int a, int b) {
    int temp = ary[a];
    ary[a] = ary[b];
    ary[b] = temp;
  }
}