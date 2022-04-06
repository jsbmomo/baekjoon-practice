import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class bj_10818 {
  
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
        
    int N = scan.nextInt();
    int[] arr = new int[N];
        
    for (int i = 0; i < N; i++) {
      arr[i] = scan.nextInt();
    }
        
    scan.close();
    Arrays.sort(arr);
    System.out.print(arr[0] + " " + arr[N - 1]);
  }
}
