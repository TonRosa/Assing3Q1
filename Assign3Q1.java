public class Assign3Q1 {
    public static void main (String [] args )
    {
        char someChar = 'a' ;

        System.out.println("Char is:" + someChar);

        switch (someChar)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Char is a Vowel ");
            break;
            default:
                 System.out.println("Char is a Consonant.");
        }
    }
}