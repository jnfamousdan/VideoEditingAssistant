package VideoLengthDAO;

import VideoLengthDAO.Modules.VideoLengthHelper;

public class VideoLengthDAO {
    private double multi;
    private String statusMsg;

    // main method to run the entire class
    public void run() {
        VideoLengthHelper.message_welcome();

        // Setup the class variables
        this.multi = VideoLengthHelper.updateMulti();
        this.statusMsg = "Welcome";

        // Operate the DAO
        operateDAO();
    }

    // Main menu of this DAO
    private void operateDAO() {
        boolean isRunning = true;
        while(isRunning){
            // Ask the user what they would like to do
            VideoLengthHelper.message_menuDAO(multi, statusMsg);
            int userInput = VideoLengthHelper.getUserInput();

            switch (userInput) {
                case 1:
                    // Return to the main menu
                    isRunning = false;
                    break;
                case 2:
                    // Process video
                    this.statusMsg = "[ERROR] This hasn't be implemented yet";
                    break;
                case 3:
                    // Update multi variable
                    VideoLengthHelper.message_updateMulti();
                    this.multi = VideoLengthHelper.updateMulti();
                    this.statusMsg = "[SUCCESS] Updated compress ratio : " + this.multi;
                    break;
            }
        }

    }
}
