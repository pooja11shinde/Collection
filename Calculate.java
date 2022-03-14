import java.util.Scanner;
public class Calculate 
{
    public static void main(String args[])
    {
        int a, b, add, subtract, multiply;
        float devide;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first Numbers : ");
        a = scanner.nextInt();

        System.out.print("Enter second Numbers : ");

        b = scanner.nextInt();

        add = a + b;
        subtract = a - b;
        multiply = a * b;
        devide = (float) a / b;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);
      }
    }