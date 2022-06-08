import java.util.Scanner;

public class MainHelper {
    // ##########################################################################################
    //  Message Methods
    // ------------------------------------------------------------------------------------------

    // Message for the main hub to choose a Helper
    public static void message_PickDAO(String statusMsg) {
        System.out.println(
                "\n---------------------------------------------------------------------" +
                        "\n- Welcome to the Main Hub!                                  -" +
                        "\n- [ReadMe.txt for Helper Descriptions]                      -" +
                        "\n-------------------------------------------------------------" +
                        "\nPlease pick the Helper you need to in your video assistance.\n\n" +
                        "1 : [Exit]\n" +
                        "2 : [Video Compression] Helper\n" +
                        "3 : [Song Choice(s)] Helper\n\n" +
                        "[Request Status] -> " + statusMsg + "\n\n" +
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
                System.out.println("Entry detected as not a number, please try again.");
            }
        }

        return results;
    }
    private static int grabInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
