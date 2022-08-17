import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2751 {
/*
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 
둘째 줄부터 N개의 줄에는 수가 주어진다. 
이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
  static int[] ary;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    ary = new int[count];
    
    for (int i = 0; i < count; i++) {
      ary[i] = Integer.parseInt(br.readLine());
    }

    for (int value : ary) {
      sb.append(value);
    }

    System.out.println(sb);
    sb.delete(0, count);

    quickSort(ary, ary[0], ary[count - 1]);

    for (int value : ary) {
      sb.append(value);
    }

    // method 1.
    // boolean[] arr = new boolean[2000001];

    // for (int i = 0; i < count; i++) {
    //   arr[Integer.parseInt(br.readLine()) + 1000000] = true;
    // }

    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i]) {
    //     sb.append((i - 1000000)).append('\n');
    //   }
    // }

    System.out.println(sb);
  }

  public static void quickSort(int[] ary, int first, int last) {
    if (first >= last) {
      return ;
    }

    int pi = partition(ary, first, last);

    quickSort(ary, first, pi - 1);
    quickSort(ary, pi + 1, last);
  }

  public static int partition(int[] ary, int first, int last) {
    int pivot = ary[first];
    int i = first, j = last;

    while (i < j) {
      while (pivot < ary[j]) {
        j--;
      }

      while (i < j && pivot >= ary[i]) {
        i++;
      }

      swap(ary, i, j);
    }

    ary[first] = ary[i];
    ary[i] = pivot;

    return i;
  }

  public static void swap(int[] ary, int a, int b) {
    int temp = ary[b];
    ary[b] = ary[a];
    ary[a] = temp;
  }
}