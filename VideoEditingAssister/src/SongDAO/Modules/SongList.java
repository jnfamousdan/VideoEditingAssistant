package SongDAO.Modules;

import java.util.HashMap;

public class SongList {
    private HashMap<Integer, Song> songList;
    private HashMap<Integer, Integer> pingList;

    public SongList() {
        this.songList = SongListHelper.generateSongList();
        this.pingList = SongListHelper.generatePingList();
    }

}