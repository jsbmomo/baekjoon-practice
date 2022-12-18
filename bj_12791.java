import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class bj_12791 {
  static ArrayList<ArrayList<String>> davidMusic;
  public static void main(String[] args) throws IOException {
    initDavidMemorial();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(br.readLine());

    for (int i = 0; i < q; i++) {
      String[] inputs = br.readLine().split(" ");
      int from = Integer.parseInt(inputs[0]);
      int to = Integer.parseInt(inputs[1]);

      StringBuilder musicTitle = new StringBuilder();
      int musicYear = 0;

      for (int year = from; year <= to; year++) {
        for (int music = 0; music < davidMusic.get(year).size(); music++) {
          musicYear++;
          musicTitle
            .append(year)
            .append(' ')
            .append(davidMusic.get(year).get(music))
            .append('\n');
        }
      }

      System.out.println(musicYear);
      System.out.print(musicTitle);
    }

    br.close();
  }

  public static void initDavidMemorial() {
    davidMusic = new ArrayList<ArrayList<String>>(2100);

    for(int i = 0; i <= 2017; i++) davidMusic.add(new ArrayList<String>());

    davidMusic.get(1967).add("DavidBowie");
    davidMusic.get(1969).add("SpaceOddity");
    davidMusic.get(1970).add("TheManWhoSoldTheWorld");
    davidMusic.get(1971).add("HunkyDory");
    davidMusic.get(1972).add("TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
    davidMusic.get(1973).add("AladdinSane");
    davidMusic.get(1973).add("PinUps");
    davidMusic.get(1974).add("DiamondDogs");
    davidMusic.get(1975).add("YoungAmericans");
    davidMusic.get(1976).add("StationToStation");
    davidMusic.get(1977).add("Low");
    davidMusic.get(1977).add("Heroes");
    davidMusic.get(1979).add("Lodger");
    davidMusic.get(1980).add("ScaryMonstersAndSuperCreeps");
    davidMusic.get(1983).add("LetsDance");
    davidMusic.get(1984).add("Tonight");
    davidMusic.get(1987).add("NeverLetMeDown");
    davidMusic.get(1993).add("BlackTieWhiteNoise");
    davidMusic.get(1995).add("1.Outside");
    davidMusic.get(1997).add("Earthling");
    davidMusic.get(1999).add("Hours");
    davidMusic.get(2002).add("Heathen");
    davidMusic.get(2003).add("Reality");
    davidMusic.get(2013).add("TheNextDay");
    davidMusic.get(2016).add("BlackStar");
  }

}
