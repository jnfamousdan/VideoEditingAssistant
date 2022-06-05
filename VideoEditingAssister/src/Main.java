import SongDAO.SongListDAO;
import VideoLengthDAO.VideoLengthDAO;

public class Main {
    private String statusMsg;

    private SongListDAO songListDAO;
    private VideoLengthDAO videoLengthDAO;

    public Main() {
        statusMsg = "Welcome";

        songListDAO = new SongListDAO();
        videoLengthDAO = new VideoLengthDAO();
    }

    public static void main(String[] args) {
        // Instantiate all the objects
        Main videoAssistHelper = new Main();

        // Run the program!
        boolean isRunning = true;
        while (isRunning) {
            // Ask the user which DAO they would like to access
            MainHelper.message_PickDAO(videoAssistHelper.statusMsg);
            int userInput = MainHelper.getUserInput();

            switch (userInput) {
                case 1:
                    // Exit
                    MainHelper.message_ExitProgram();
                    isRunning = false;
                    break;
                case 2:
                    // videoLengthDAO
                    videoAssistHelper.videoLengthDAO.run();
                    videoAssistHelper.statusMsg = "Welcome back";
                    break;
                case 3:
                    // SongListDAO
                    videoAssistHelper.songListDAO.run();
                    videoAssistHelper.statusMsg = "[ERROR] Not implemented yet";
                    break;
            }
        }
    }
}
