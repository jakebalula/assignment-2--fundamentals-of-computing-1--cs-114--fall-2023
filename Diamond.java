import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int number;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
    if (number % 2 == 0) {//Sees if input is even or odd
      {
      for (int row = number ; row <= number; row++)
      {
        for (int star = 1; star <= row; star++)
          System.out.print("*");

        System.out.println();
      }
      System.out.println("Even");
      }
    }
    else
      System.out.println("Odd");


  }
}
