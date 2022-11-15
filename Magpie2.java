/**
 * Sean Pichay
 * ITSC1212 - 202, Mazumder
 * @version 1.1
 * @since   2022-03-03
 * Magpie2
 * Class that runner runs.
 */
public class Magpie2 {
    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        String myString = "no";
        if (statement.indexOf("no") >= 0 && statement.startsWith(myString))
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0
                || statement.indexOf("fish") >= 0
                || statement.indexOf("lion") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mazumder") >= 0
                || statement.indexOf("mazumder") >= 0)
        {
            response = "She sounds like a good teacher.";
        }
        else if (statement.indexOf("CSGO") >= 0
                || statement.indexOf("COD") >=0
                || statement.indexOf("Valorant") >= 0
                || statement.indexOf("R6") >= 0)
        {
            response = "Tell me more about your video games.";
        }
        else if (statement.indexOf("Kawasaki") >= 0
                || statement.indexOf("BMW") >=0
                || statement.indexOf("Aprilia") >= 0
                || statement.indexOf("Honda") >= 0)
        {
            response = "Tell me more about your motorcycles.";
        }
        else if (statement.indexOf("burger") >= 0
                || statement.indexOf("fries") >= 0
                || statement.indexOf("hotdogs") >= 0
                || statement.indexOf("wings") >= 0)
        {
            response = "Tell me more about food.";
        }
        else if (statement.trim().length() == 0)
        {
            response = "Please say something.";
        }
        else if (statement.indexOf("near") >=0 && statement.indexOf("Starbucks") >= 0)
        {
            response = "The nearest Starbucks is 0.5 miles away from the union.";
        }
        else if (statement.indexOf("park") >= 0 && !(statement.indexOf("car") >=0))
        {
            response = "I bet the trees are lovely this time of year.";
        }
        else if (statement.indexOf("park") >= 0 && statement.indexOf("car") >= 0)
        {
            response = "Parking on campus is atrocious and expensive";
        }
        else if (statement.indexOf("rock") >=0 && !(statement.indexOf("music") >= 0))
        {
            response = "I had a rock collection too!";
        }
        else if (statement.indexOf("rock") >= 0 && statement.indexOf("music") >=0)
        {
            response = "What is your favorite band?";
        }
        else if (statement.indexOf("mom") >=0 && statement.indexOf("love") >= 0 && statement.indexOf("cooking") >= 0 )
        {
            response = "I'll bet it's delicious.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        if (whichResponse == 0)
        {

            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "No comprende.";
        }
        else if (whichResponse == 5)
        {
            response = "Pardon me?";
        }
        return response;
    }
}
