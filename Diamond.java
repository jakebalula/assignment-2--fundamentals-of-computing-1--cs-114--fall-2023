import java.util.Scanner;
public class Diamond {
  public static void main(String[] args) {
    int row;
    int i;
    int j;
    System.out.println("Please enter a number");
    Scanner scan = new Scanner(System.in);
    row = scan.nextInt();
    if (row % 2 == 0) {//Sees if input is even or odd
      for (i = 0 ; i < row; i++) {
        for (j = 0; j < row - i - 1; j++) {
          System.out.print(" ");
        }
        for (j = 0; j <= i; j++){
          System.out.print("* ");
        }
        System.out.println();
      }
      for (i = 0; i < row-1; i++) {
        for (j=0;j<=i; j++) {
          System.out.print(" ");
      }
      for (j = 0; j<row-i-1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    //else
    }
  }
}
