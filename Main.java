import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       
        System.out.println("intput amount of coffees");
        Scanner scan1 = new Scanner(System.in);
        int coffeeAmount = scan1.nextInt();
        
        System.out.println("intput amount of pastries");
        Scanner scan2 = new Scanner(System.in);
        int pastryAmount = scan2.nextInt();
       
        System.out.println("intput amount of teas");
        Scanner scan3 = new Scanner(System.in);
        int teaAmount = scan3.nextInt();
        System.out.println("Please type in a promo code");
        Scanner scan = new Scanner(System.in);
        String code = scan.nextLine();
        double coffeePrice=2.10;
        double teaPrice=1.60;
        double pastryPrice=2.75;
        if (code.equals("STUDENT10"))
        {
            coffeePrice=2.10*0.9;
            teaPrice=1.60*0.9;
            pastryPrice=2.75*0.9;
        }
        
        
        double subtotal = (((coffeeAmount*coffeePrice)+(pastryAmount*pastryPrice)+(teaAmount*teaPrice))*1.21)*1.3;
        System.out.println("coffee   amount: "+coffeeAmount+" price "+((double)Math.round(coffeePrice*coffeeAmount*100))/100);
        System.out.println("pastry  amount: "+pastryAmount+" price "+((double)Math.round(pastryPrice*pastryAmount*100))/100);
        System.out.println("tea   amount: "+teaAmount+" price "+((double)Math.round(teaPrice*teaAmount*100))/100);
        System.out.println("tax "+(((double)Math.round(((teaPrice*teaAmount*100)+(coffeePrice*coffeeAmount*100)+(pastryPrice*pastryAmount*100))*0.21))/100));
        System.out.println("service fee "+(((double)Math.round(((teaPrice*teaAmount*100)+(coffeePrice*coffeeAmount*100)+(pastryPrice*pastryAmount*100))*1.21*0.3))/100));
        System.out.println("total "+ subtotal);
     }
 }
