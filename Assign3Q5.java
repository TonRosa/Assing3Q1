public class Assign3Q5
{           
    public static void main(String[] args)
    {
        int currentValue = 5;
        int factorial = currentValue;
        int i = 1;
        while (i < currentValue - 1)
        {
            factorial *= (currentValue - i);
            i++;
        }

        System.out.println("Factorial of " + currentValue + " = " + factorial);
    }
}
