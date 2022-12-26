import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_1755 {
  static String[] read = {
    "zero", "one", "two", "three", "four", 
    "five", "six", "seven", "eight", "nine"
  };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    ArrayList<Word> list = new ArrayList<>();
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    for (int i = M; i <= N; i++) {
      String temp = Integer.toString(i);
      char[] ch = temp.toCharArray();
      StringBuilder sb = new StringBuilder();

      for (int j = 0; j < ch.length; j++) {
        sb.append(read[ch[j] - '0']);

        if (ch.length > 1) sb.append(" ");
      }

      list.add(new Word(sb.toString(), i));
    }
    
    Collections.sort(list);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).num + " ");

      if ((i + 1) % 10 == 0) System.out.println();
    }

    br.close();
  }

  static class Word implements Comparable<Word> {
    String word;
    int num;

    public Word(String word, int num) {
      super();
      this.word = word;
      this.num = num;
    }

    @Override
    public int compareTo(Word o) {
      return this.word.compareTo(o.word);
    }
  }

}
