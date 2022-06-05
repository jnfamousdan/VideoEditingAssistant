import java.util.Scanner;

public class MainHelper {
    // ##########################################################################################
    //  Message Methods
    // ------------------------------------------------------------------------------------------

    // Message for the main hub to choose a Helper
    public static void message_PickDAO() {
        System.out.println(
                "\n-------------------------------------------------------------" +
                        "\n- Welcome to the Main Hub!                                  -" +
                        "\n-------------------------------------------------------------" +
                        "\nPlease pick the Helper you need to in your video assistance.\n\n" +
                        "1 : Song Choice(s) Helper\n" +
                        "2 : Video Extend/Compress Helper\n" +
                        "0 : Exit\n\n" +
                        "Enter your number below:");
    }

    // Message for when the user exits the program
    public static void message_ExitProgram() {
        System.out.println(
                "Thanks for using this program\n" +
                        "Have a great day!");
    }


    // ##########################################################################################
    //  Processing Methods
    // ------------------------------------------------------------------------------------------

    // Method for grabbing user inputs in the console, it makes sure that it's an int.
    public static int getUserInput() {
        int results = 0;

        while (true) {
            try {
                results = grabInput();
                break;
            } catch (Exception e) {
                System.out.println(
                        "Entry detected as not a number, please try again.");
            }
        }

        return results;
    }

    // ##########################################################################################
    //  Private Methods
    // ------------------------------------------------------------------------------------------

    // Grab user input from console, throws exception error so make sure the upper method is try/catch
    private static int grabInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
