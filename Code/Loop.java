public class Loop
{
    public static void main(String[] args)
    {
        // declarere en variable
        //int i = 0;

        // Betingelse
        //i <= 10

        // Ændring a variablen i
        // i + 1

        // for(int i = 0; i <= 10; i = i+1)
        // {
        //     // udfør denne kode for hver iteration
        //     System.out.println("Hello World nummer " + i);
        // }

        // System.out.println("Hello World nummer er slut");



        // 1
        // for(int i = 0; i < 0; i = i+1)
        // {
        //     System.out.println("* * * * * * * * * *");
        // }

        // 2 Fencepost
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

        for(int i = 1; i <= 20; i = i+1)
        {
            System.out.print(i + ", ");
        }

        System.out.println("20");


        for(int i = 1; i <= 20; i = i+1)
        {
            if(i == 20)
            {
                System.out.println(i);
            }else {
                System.out.print(i + ", ");
            }
        }

    }
}