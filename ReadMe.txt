6-2-22 : Began project creation
##############################################################################################
# Welcome!                                                                                   #
# This is my YouTube Video Editing Helper program that assists in me in a few different ways.#
##############################################################################################
Some examples are:
- Helps the user choose a song and ensures it hasn't been selected recently
- Helps the user figure out how far back to compress the video to make it 2x,3x, etc - whatever the user wants.

***********************************
* Project Structure Documentation *
***********************************
Main{
    Description: This is the main running class to operate the program
};

------------------------
- Song Choosing Helper -
------------------------

- The purpose of this Song Choosing Helper is to assist the user in selecting a song and
  ensures it hasn't been selected recently
- This uses the saveFile.txt file to serialize the songList so that it can be saved for use later

SongList {
    Description: This class's purpose is to provide the DAO with a way to build a songList

    String[] songList;
    int[] pingList;

};

SongListDAO {
    Description: This class contains all the methods for the songList, it also recommends a song to the user and,
                 it will modify the saveFile.txt when it grabs a random song
};