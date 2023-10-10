import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int number;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
    if (number % 2 == 1) {//Sees if input is even or odd
      for (int row = 1 ; row <= number; row++) {
        for (int star = 1; star <= number; star++) {
          if (row + star == number-1)

            System.out.print("*");
          else
            System.out.print(" ");
      }
      System.out.println("\n");
      }
    }

  }
}
