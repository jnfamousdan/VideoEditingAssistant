6-2-22 : Began project creation
##############################################################################################
# Welcome!                                                                                   #
# This is my YouTube Video Editing Helper program that assists in me in a few different ways.#
##############################################################################################
Some examples are:
- Helps the user choose a song and ensures it hasn't been selected recently
- Helps the user figure out how far back to compress the video to make it 2x,3x, etc - whatever the user wants.

***********************************
* Helper Documentation *
***********************************

------------------------
- Song Choosing Helper -
------------------------

- The purpose of this Song Choosing Helper is to assist the user in selecting a song and
  ensures it hasn't been selected recently
- This uses the saveFile.txt file to serialize the songList so that it can be saved for use later

------------------------
- Video Length Helper  -
------------------------
- This Helper is useful for allowing the user to quickly know how far to compress a video clip.
- Example case below:

- Video Clip that goes from 0:00 -> 3:00. 1x speed.

1. Desire is to make the video 3x faster
2. Input 3 as the compression multiplier in the program
3. Enter the video clip properties into the program
4. See Request Status line
5. Compress your video to the new suggested end.
    - In this example, the program will output 1:00

- Video Clip new settings is 0:00 -> 1:00. 3x speed (Or very close!)