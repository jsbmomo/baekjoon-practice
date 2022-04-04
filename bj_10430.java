import java.util.Scanner;

public class bj_10430 {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    
    System.out.println(calculator_1(a, b, c));
    System.out.println(calculator_2(a, b, c));
    System.out.println(calculator_3(a, b, c));
    System.out.println(calculator_4(a, b, c));

    scan.close();
  }
  
  public static int calculator_1(int a, int b, int c) {
    return (a + b) % c;
  }
  public static int calculator_2(int a, int b, int c){
    return ((a % c) + (b % c)) % c;
  }
  public static int calculator_3(int a, int b, int c) {
    return (a * b) % c;
  }
  public static int calculator_4(int a, int b, int c) {
    return ((a % c) * (b % c)) % c;
  }
}
