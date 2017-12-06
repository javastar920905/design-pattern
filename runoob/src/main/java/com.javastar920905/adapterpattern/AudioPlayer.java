package com.javastar920905.adapterpattern;


/**
 * Created by ouzhx on 2016/12/27.
 */
public class AudioPlayer implements MediaPlayer {
  MediaAdapter mediaAdapter;

  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {// mediaAdapter
      mediaAdapter = new MediaAdapter(audioType);
      mediaAdapter.play(audioType, fileName);
    } else if (audioType.equalsIgnoreCase("MP3")) {
      System.out.println("使用内置MP3播放器播放 fileName:" + fileName);
    } else {
      System.out.println("Invalid media. " + audioType + " format not supported");
    }

  }
}
