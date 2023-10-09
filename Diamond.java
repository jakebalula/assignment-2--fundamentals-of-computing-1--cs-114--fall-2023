import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int number;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
    if (number % 2 == 0)
      System.out.println("Even");
    else
      System.out.println("odd");


  }
}
