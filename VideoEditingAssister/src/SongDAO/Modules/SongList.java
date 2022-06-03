package SongDAO.Modules;

import java.util.HashMap;

public class SongList {
    private HashMap<Integer, String> songList;
    private HashMap<Integer, Integer> pingList;

    public HashMap<Integer, String> getSongList() {
        return songList;
    }

    private void setSongList(HashMap<Integer, String> songList) {
        this.songList = songList;
    }

    public HashMap<Integer, Integer> getPingList() {
        return pingList;
    }

    private void setPingList(HashMap<Integer, Integer> pingList) {
        this.pingList = pingList;
    }

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