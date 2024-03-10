import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_12790 {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    final int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      st = new StringTokenizer(br.readLine());

      int HP = Integer.parseInt(st.nextToken());
      int MP = Integer.parseInt(st.nextToken());
      int ATTACK = Integer.parseInt(st.nextToken());
      int DEFENSE = Integer.parseInt(st.nextToken());

      int appendHP = HP + Integer.parseInt(st.nextToken());
      int appendMP = MP + Integer.parseInt(st.nextToken());
      int appendAttack = ATTACK + Integer.parseInt(st.nextToken());
      int appendDefence = DEFENSE + Integer.parseInt(st.nextToken());

      int result = checkHP(HP, appendHP) * 1 + checkMP(MP, appendMP) * 5 + checkATTACK(ATTACK, appendAttack) * 2 + (DEFENSE + appendDefence) * 2;

      sb.append(result).append('\n');
    }

    System.out.println(sb.toString());
    br.close();
  }

  static int checkHP(int a, int b) {
    return a + b < 1 ? 1 : a + b;
  }

  static int checkMP(int a, int b) {
    return a + b < 1 ? 1 : a + b;
  }

  static int checkATTACK(int a, int b) {
    return a + b < 0 ? 0 : a + b;
  }
}
