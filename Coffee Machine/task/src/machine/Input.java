package machine;

import java.util.Scanner;

public class Input
{
    public String getStringInput()
    {
        String msg;
        Scanner s = new Scanner(System.in);

        while (true)
        {
            msg = s.nextLine();
            if (msg.trim().isBlank())
            {
                System.out.println("Invalid input. Try again.");
            }
            else
            {
                msg = msg.trim();
                break;
            }
        }

        return msg;
    }

    public static int getIntegerInput()
    {
        int input;
        Scanner s = new Scanner(System.in);

        while (true)
        {
            try
            {
                input = Integer.parseInt(s.nextLine());
                break;
            }
            catch (Exception e)
            {
                System.out.println("Wrong Input!");
            }
        }
        return input;
    }
}
