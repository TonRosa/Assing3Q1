public class Assign3Q3 
{
    public static void main(String[] args) 
    {  
        int currentValue = 5;
        int factorial = currentValue;
        for (int i = 1; i < currentValue - 1; i++)
        {
            factorial *= (currentValue - i);
        }

        System.out.println("Factorial of " + currentValue + " = " + factorial);
    }
}