import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int number;
    int row;
    int col;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
    if (number % 2 == 1) {//Sees if input is even or odd
      for (row = 1; row <= number; row++) {
        for (col = 0; col < row; col++) {
          System.out.print("*");
       }
       System.out.println();
      }
      for (row = number - 1; row > 0; row--) {
                for (col = 0; col < row; col++) {
                  System.out.print("*");
          }
          System.out.println();
      }
      }
    }
  }
