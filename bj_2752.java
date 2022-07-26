import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
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
    
    // Arrays.sort(input);
    quickSort(input, 0, input.length - 1);

    for (int val : input) {
      bw.append(val + " ");
    }

    bw.flush();
    bw.close();
    br.close();
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
    int tmp = ary[b];
    ary[b] = ary[a];
    ary[a] = tmp;
  }
}
