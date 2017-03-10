public class Greeting
{   
    // øvelse 3
    public static void main(String[] args)
    {
        greet(3);
    }

    private static void greet(int number)
    {
        for(int i = 1; i <= number ; i++)
        {
            System.out.println("Hello " + i);
        }
    }



}