public class Assign3Q2 
{
    public static void main (String [] args)
    {
        String currentMonth = "january" ;
        int numberofdays = 31 ;

        System.out.println(currentMonth+ " = " + numberofdays + "days.");

        switch (currentMonth) 
        {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "Octuber":
            case "December":
                System.out.println(currentMonth+ "=" + 31 + "days.");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println(currentMonth+ "=" + 30 + "days.");
                break;
            case "February":
                System.out.println(currentMonth+ "=" + 28  + "days.");
                break;
            default:
                System.out.println("No match");
            }
    }
}