import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner cat = new Scanner(System.in);
    System.out.println("caluculater asks what do you want to do");
    System.out.println("1 add");
    System.out.println("2 subtract");
    System.out.println("3 multiply");
    System.out.println("4 divide");
    System.out.println("5 shell shockers");

    int number = cat.nextInt();
    if (number == 5) {
       System.out.println("https://shellshock.io");
    }

    if (number == 1) {
      System.out.println("1st number: ");
      double num1 = cat.nextInt();
      System.out.println("2nd number:");
      double num2 = cat.nextInt();

      double result = num1 + num2;
      System.out.println("result: " + num1 + " + " + num2 + " = " + result);
    }

    if (number == 2) {
      System.out.println("1st number: ");
      double num3 = cat.nextInt();
      System.out.println("2nd number:");
      double num4 = cat.nextInt();

      double result2 = num3 - num4;
      System.out.println("result: " + num3 + " - " + num4 + " = " + result2);
    }
    if (number == 3) {
      System.out.println("1st number: ");
      double num5 = cat.nextInt();
      System.out.println("2nd number:");
      double num6 = cat.nextInt();

      double result3 = num5 * num6;
      System.out.println("result: " + num5 + " * " + num6 + " = " + result3);
  }
  if (number == 4) {
      System.out.println("1st number: ");
      double num7 = cat.nextInt();
      System.out.println("2nd number:");
      double num8 = cat.nextInt();

      double result4 = num7 / num8;
      System.out.println("result: " + num7 + " / " + num8 + " = " + result4);
  }
}
}