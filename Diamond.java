import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int number = 0;
    int row;
    int col;
    int star;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    number = scan.nextInt();
    if (number % 2 == 1) {//Sees if input is even or odd
      //Odd Diamond
      for (row = 0; row <= number; row++) { //Top half
        for (col = row - 1; col <= number; col++) {//print spaces
          System.out.print(" ");
       }
        for (star = 1; star <= row; star++) { //print stars
          System.out.print("*");
        }
        System.out.println();
      }
      for (row = number - 1; row >= 1; row--) { //Bottom half
        for (col = number; col >= row; col--) { //Prints spaces
          System.out.print(" ");
        }
        for (star = 1; star <= row ; star++) { //Prints Stars
          System.out.print("*");
          }
        System.out.println();
      }
     }
    }
  }
