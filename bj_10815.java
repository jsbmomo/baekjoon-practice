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
  static int[] cards;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    own = Integer.parseInt(br.readLine());
    ownCards = inputCards(br.readLine(), own);
  
    card = Integer.parseInt(br.readLine());
    cards = inputCards(br.readLine(), card);

    Arrays.sort(ownCards);

    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < card; i++) {
      if (binarySearch(cards[i])) sb.append("1 ");
      else sb.append("0 ");
    }

    System.out.println(sb.toString());
    br.close();
  }

  static int[] inputCards(String input, int len) {
    int[] temp = new int[len];
    st = new StringTokenizer(input);

    for (int i = 0; i < len; i++) {
      temp[i] = Integer.parseInt(st.nextToken());
    }

    return temp;
  }

  private static boolean binarySearch(int num) {
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
