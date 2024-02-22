public class Assign3Q6 
{
    public static void main(String[] args)
    {
        {
            int i = 0;
            while (i < 4)
            {
                int j = 0;
                while (j < 10)
                {
                    System.out.print("*");
                    j++;
                }
                System.out.println("");
                i++;
            }
        }

        System.out.println("");

        {
            int i = 0;
            while (i < 5)
            {
                int j = 0;
                while (j < i + 1)
                {
                    System.out.print("*");
                    j++;
                }
                System.out.println("");
                i++;
            }
        }

        System.out.println("");

        {
            int i = 0;
            while (i < 5)
            {
                int j = 1;
                while (j < 5-i)
                {
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while (k < i + 1)
                {
                    System.out.print("*");
                    k++;
                }
                System.out.println("");
                i++;
            }
        }

        System.out.println("");

        {
            int i = 0;
            while (i < 5)
            {
                int j = 1;
                while (j < 5-i)
                {
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while (k < 2 * i + 1)
                {
                    System.out.print("*");
                    k++;
                }
                System.out.println("");
                i++;
            }
        }

        System.out.println("");

        {
            int i = 0;
            while (i < 5)
            {
                int j = 1;
                while (j < 5-i)
                {
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while (k < 2 * i + 1)
                {
                    System.out.print(i+1);
                    k++;
                }
                System.out.println("");
                i++;
            }
        }

        System.out.println("");

        {
            int i = 0;
            while (i < 5)
            {
                int j = 1;
                while (j < 5-i)
                {
                    System.out.print(" ");
                    j++;
                }
                int k = 0;
                while (k < 2 * i + 1)
                {
                    if (k < i)
                    {
                        System.out.print(i+1-k);
                    }
                    else
                    {
                        System.out.print(k+1-i);
                    }
                    k++;
                }
                System.out.println("");
                i++;
            }
        }
    }
}
