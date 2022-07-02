import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class bj_1707 {
  
  static class Node {
    int left;
    int right;

    public Node(int left, int right) {
      this.left = left;
      this.right = right;
    }
  }

  static List<Node>[] list;
  static StringBuilder sb = new StringBuilder();
  
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    list = new ArrayList[n + 1];
    for (int i = 1; i < n + 1; i++) {
      list[i] = new ArrayList<>();
    }

    for (int i = 1; i < n + 1; i++) {
      String[] line = br.readLine().split(" ");
      int data = line[0].charAt(0) - 'A' + 1;
      int left = line[1].charAt(0) - 'A' + 1;
      int right = line[2].charAt(0) - 'A' + 1;
      list[data].add(new Node(left, right));
    }

    preorder(1);
    sb.append("\n");
    System.out.println(sb.toString());
  }


  static void preorder(int start) {
    for (Node node : list[start]) {
      int left = node.left;
      int right = node.right;

      sb.append((char)(start + 'A' - 1));
      if (left != - 18) preorder(left);
      if (right != - 18) preorder(right);
    }
  }
} 