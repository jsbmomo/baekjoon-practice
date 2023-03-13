import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_10815 {
  static StringTokenizer st;
  static int own;
  static int[] ownCards;
  static int card;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    own = Integer.parseInt(br.readLine());
    ownCards = inputOwnCards(br.readLine(), own);
  
    card = Integer.parseInt(br.readLine());

    System.out.println(cardCheck(br.readLine(), card));

    br.close();
  }

  static String cardCheck(String input, int len) {
    StringBuilder sb = new StringBuilder();
    st = new StringTokenizer(input);
        
    for (int i = 0; i < card; i++) {
      int cardValue = Integer.parseInt(st.nextToken());

      if (binarySearch(cardValue)) sb.append("1 ");
      else sb.append("0 ");
    }

    return sb.toString();
  }

  static int[] inputOwnCards(String input, int len) {
    int[] temp = new int[len];
    st = new StringTokenizer(input);

    for (int i = 0; i < len; i++) {
      temp[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(temp);

    return temp;
  }

  static boolean binarySearch(int num) {
    int leftIndex = 0;
    int rightIndex = own - 1;

    while(leftIndex <= rightIndex){
      int midIndex = (leftIndex + rightIndex) / 2;
      int mid = ownCards[midIndex];

      if(num < mid) rightIndex = midIndex - 1;
      else if(num > mid) leftIndex = midIndex + 1;
      else return true;
    }
    return false;
  }
}
