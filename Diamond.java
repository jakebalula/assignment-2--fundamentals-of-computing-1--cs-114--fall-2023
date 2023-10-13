import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int number = 0;
    int row;
    int col;
    int star;
    int space;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
    if (number % 2 == 1) {//Sees if input is even or odd
      //Odd Diamond
      for (row = 1; row <= (number + 1) / 2; row++) { //Top half
        for (col = 1; col <= (number + 1) / 2 - row; col++) {//print spaces
          System.out.print(" ");
       }
        for (star = 1; star <= 2 * row - 1; star++) { //print stars
          System.out.print("*");
        }
        System.out.println();
      }
      for (row = (number - 1) / 2; row >= 1; row--) { //Bottom half
        for (col = 1; col <= (number + 1) / 2 - row; col++) { //Prints spaces
          System.out.print(" ");
        }
        for (star = 1; star <= 2 * row - 1; star++) { //Prints Stars
          System.out.print("*");
          }
        System.out.println();
      }
     }
    else {
     for (row = 1; row <= number / 2; row++) {
      for (space = 1; space <= number / 2 - row; space++) {
        System.out.print("  ");
      }
      for (star = 1; star <= 2 * row; star++) {
        if (star > 1) {
          System.out.print(" *");
        } else {
            System.out.print("*");
      }
    }
      System.out.println();
    }
      for (row = number / 2 - 1; row >= 1; row--) {
        for (space = 1; space <= number / 2 - row; space++) {
          System.out.print("  ");
        }
        for (star = 1; star <= 2 * row; star++) {
          if (star > 1) {
            System.out.print(" *");
        } else {
            System.out.print("*");
        }
        }
        System.out.println();
      }
      }
      scan.close();
    }
  }
