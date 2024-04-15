import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */

    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();

    double weight = in.nextDouble();

    double BMI = weight / Math.pow(height, 2);
    System.out.printf("%.1f", BMI);
  }
}
