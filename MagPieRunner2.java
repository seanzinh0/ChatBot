/**
 * Sean Pichay
 * ITSC1212 - 202, Mazumder
 * @version 1.0
 * @since   2022-02-24
 * MagPieRunner2
 * Runs Magpie class.
 */
import java.util.Scanner;
/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */

public class MagPieRunner2 {
    /**
     * Create a Magpie, give it user input, and print its
     replies.
     */
    public static void main(String[] args)
    {
        Magpie2 maggie = new Magpie2();
        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();
        while (!statement.equals("Bye"))
        {
            System.out.println
                    (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}
