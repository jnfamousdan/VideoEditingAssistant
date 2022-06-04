package SongDAO.Modules;

import java.util.HashMap;

public class SongList { // Song duration finder
    private HashMap<Integer, String> song;
    private HashMap<Integer, Integer> pingTimes;
    private HashMap<Integer, String> songDuration;

    // -------------------------------- Custom Methods Below
    // This method either creates a new Hashmap or it deserializes it from the saveFile.txt
    public HashMap<Integer, String> grabSongList() {
        return null;
    }

    // This method either creates a new Hashmap or it deserializes it from the saveFile.txt
    public HashMap<Integer, Integer> grabPingList() {
        return null;
    }
}