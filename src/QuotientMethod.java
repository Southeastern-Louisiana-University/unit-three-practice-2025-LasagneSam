public class QuotientMethod
{
    public static int quotient(int num1In, int num2In)
    {
        if (num2In == 0)
        {
            System.out.print("What does it mean to divide by 0......");
            System.exit(1);
        }

        return (num1In / num2In);
    }
}
