import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();

    String[] s = n.split("\\s");

    int a = Integer.parseInt(s[0]);
    int b = Integer.parseInt(s[1]);

    System.out.println((double) a / b);

  }
}
