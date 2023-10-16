import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int userInput = 0;
    int row = 0;
    int col;
    int star;
    int space;
    int oneStar;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    userInput = scan.nextInt();
    if (userInput % 2 == 1) {//Sees if input is even or odd
      //Odd Diamond
      for (row = 1; row <= (userInput + 1) / 2; row++) { //Top half
        for (col = 1; col <= (userInput + 1) / 2 - row; col++) {//print spaces
          System.out.print(" ");
       }
        for (star = 1; star <= 2 * row - 1; star++) { //print stars
          System.out.print("*");
        }
        System.out.println();
      }
      for (row = (userInput - 1) / 2; row >= 1; row--) { //Bottom half
        for (col = 1; col <= (userInput + 1) / 2 - row; col++) { //Prints spaces
          System.out.print(" ");
        }
        for (star = 1; star <= 2 * row - 1; star++) { //Prints Stars
          System.out.print("*");
          }
        System.out.println();
      }
     }
    else { // Even Star
    for (oneStar = 0; oneStar < (userInput / 2) - 1; oneStar++)
      System.out.print("  ");
    System.out.println(" *");
     for (row = 1; row <= userInput / 2; row++) { //Top half
      for (space = 1; space <= userInput / 2 - row; space++) { //prints spaces
        System.out.print("  ");
      }
      for (star = 1; star <= 2 * row; star++) { //prints Star
        if (star > 1) {
          System.out.print(" *");
        } else {
            System.out.print("*");
      }
    }
      System.out.println();
    }
      for (row = userInput / 2 - 1; row >= 1; row--) { //Bottom half
        for (space = 1; space <= userInput / 2 - row; space++) { //prints spaces
          System.out.print("  ");
        }
        for (star = 1; star <= 2 * row; star++) { //Prints stars
          if (star > 1) {
            System.out.print(" *");
        } else {
            System.out.print("*");
        }
        }
        System.out.println();
      }
    for (oneStar = 0; oneStar < (userInput / 2) - 1; oneStar++)
      System.out.print("  ");
    System.out.println(" *");
      }
      scan.close();
    }
  }
