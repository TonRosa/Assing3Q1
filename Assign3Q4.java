public class Assign3Q4 
{   
    public static void main(String[] args)
     {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        } 
        
        System.out.println("");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 1; j < 5 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 1; j < 5 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 1; j < 5 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++)
            {
                System.out.print(i+1);
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 5; i++)
        {
            for (int j = 1; j < 5 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++)
            {
                if (j < i)
                {
                    System.out.print(i+1-j);
                }
                else
                {
                    System.out.print(j+1-i);
                }
            }
            System.out.println("");
        }

        System.out.println("");
    }
}