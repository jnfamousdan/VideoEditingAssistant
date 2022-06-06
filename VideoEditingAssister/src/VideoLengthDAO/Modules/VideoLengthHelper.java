package VideoLengthDAO.Modules;

import java.util.Scanner;

public class VideoLengthHelper {
    // ##########################################################################################
    //  Message Methods
    // ------------------------------------------------------------------------------------------

    public static void message_welcome() {
        System.out.println("-------------------------------------------------------------" +
                "\nWelcome to the Video Compression Helper" +
                "\n\nPlease enter the desired compression multiplier" +
                "(See [ReadMe.txt] if unsure for input");
    }

    public static void message_menuDAO(double multi, String statusMsg) {
        System.out.println(
                "-----------------------------------------" +
                        "\nCurrent video compress ratio is: " + multi +
                        "\n\n1 : [Return] back to main menu" +
                        "\n2 : [Process] video via the compress ratio" +
                        "\n3 : [Update] the compress ratio" +
                        "\n\n[Request Status] -> " + statusMsg +
                        "\n\nEnter your input below:");
    }

    public static void message_updateMulti() {
        System.out.println("Please enter new compress ratio for video processing");
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

    // Method for grabbing user inputs in the console, it makes sure that it's a double.
    public static double updateMulti() {
        double results = 0.0;

        while (true) {
            try {
                results = grabNewMulti();
                break;
            } catch (Exception e) {
                System.out.println("Entry not a number, please try again.");
            }
        }

        return results;
    }

    private static double grabNewMulti() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    // Method for processing the video based on compression multi
    public static String processVideo(double multi) {
        // Variable collecting
        System.out.println("Start [Minute] input:");
        int startMinute = getUserInput();
        System.out.println("Start [Seconds] input:");
        int startSecond = getUserInput();
        System.out.println("End [Minute] input:");
        int endMinute = getUserInput();
        System.out.println("End [Seconds] input:");
        int endSecond = getUserInput();

        // Digest the input info
        int startTotal = (startMinute * 60) + startSecond;
        int endTotal = (endMinute * 60) + endSecond;
        int grandTotal = (int) (((endTotal - startTotal) / multi) + startTotal);

        int resultMinutes = 0;
        int resultSeconds = 0;
        while (grandTotal >= 60) {
            grandTotal -= 60;
            resultMinutes++;
        }
        resultSeconds += grandTotal;

        // Output the results
        if (resultSeconds < 10) {
            return "[COMPLETE] Update video end to [" + resultMinutes + ":0" + resultSeconds + "]";
        } else {
            return "[COMPLETE] Update video end to [" + resultMinutes + ":" + resultSeconds + "]";
        }
    }
}
