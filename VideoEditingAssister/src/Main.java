import SongDAO.SongListDAO;

public class Main {
    private SongListDAO songListDAO;

    public Main() {

        songListDAO = new SongListDAO();
    }

    public static void main(String[] args){
        // Instantiate all the objects
        Main videoAssistHelper = new Main();

        // Run the program!
        boolean isRunning = true;
        while(isRunning){
            // Ask the user which DAO they would like to access
            MainHelper.message_PickDAO();
            int userInput = MainHelper.getUserInput();

            switch (userInput){
                case 1:
                    // SongListDAO
                    videoAssistHelper.songListDAO.run();
                    break;
                case 0:
                    // Exit
                    MainHelper.message_ExitProgram();
                    isRunning = false;
                    break;
                //default:
                    //System.out.println("Sorry but the value you have inputted is not supported! Try again.");
            }
        }
    }
}
