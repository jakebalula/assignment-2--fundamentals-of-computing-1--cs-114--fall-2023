import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int i;
    int j;
    int spaces;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    i = scan.nextInt();
    if (i % 2 == 1) {//Sees if input is even or odd
      for (j = 0; j <= i-1; j++)
        System.out.print("*");
    }
  }
}
