import java.util.Scanner;
public class IncomeTax
{
    public static void main(String[] args)
    {
        System.out.println("ENTER YOUR INCOME (in Lakhs)");
        Scanner sc =new Scanner(System.in);
        float income=sc.nextFloat();
        float tax=0.2F;
        double v=income-2.5;
        double w=income-5.0;
        double x=income-7.5;
        double y=income-10.0;
        double z=income-12.5;
        double a=income-15;
        if (income<=2.5)
        { tax=tax+0; }
        else if (income>2.5 && income<=5.0)
        { tax = (float) (tax + 0.05*v); }
        else if (income>5.0 && income<=7.5)
        { tax = (float) (tax + 0.05*2.5 + 0.1*w); }
        else if (income>7.5 && income<=10.0)
        { tax = (float) (tax + 0.05*2.5 + 0.1*2.5 + 0.15*x); }
        else if (income>10.0 && income<=12.5)
        { tax = (float) (tax + 0.05*2.5 + 0.1*2.5 + 0.15*2.5 + 0.2*y); }
        else if (income>12.5 && income<=15)
        { tax = (float) (tax + 0.05*2.5 + 0.1*2.5 + 0.15*2.5 + 0.2*2.5 + 0.25*z); }
        else if (income>15)
        { tax = (float) (tax + 0.05*2.5 + 0.1*2.5 + 0.15*2.5 + 0.2*2.5 + 0.25*2.5 + 0.3*a );  }
        System.out.println("YOUR ESTIMATED TAX IS " + tax*100000 + "  rupees" );
    }
}