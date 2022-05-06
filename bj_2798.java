import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2798 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());

    int cardCount = Integer.parseInt(st1.nextToken());
    int targetValue = Integer.parseInt(st1.nextToken());
    int[] cards = new int[cardCount];

    for (int i = 0; i < st2.countTokens(); i++) {
      cards[i] = Integer.parseInt(st2.nextToken());
    }

    int result = 0;
    int cardSum = 0;
    for (int i = 0; i < cards.length; i++) {
      for (int j = i + 1; j < cards.length; j++) {
        for (int z = j + 1; z < cards.length; z++) {
          cardSum = cards[i] + cards[j] + cards[z];
          if (cardSum <= targetValue && result < cardSum) {
            result = cardSum;
          }
        }
      }
    }

    System.out.println(result);
  }
  
}
