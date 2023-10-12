import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int number;
    int j;
    int i;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
    if (number % 2 == 1) {//Sees if input is even or odd

      for (i = 0; i < number; i++) {
        for (j = 0; j < number-i; j++) {
          System.out.print(" ");
        }
        for (j = 0; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
