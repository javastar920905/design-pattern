package com.javastar920905;

import com.javastar920905.impl.Mp4Palyer;
import com.javastar920905.impl.VlcPlayer;

/**
 * Created by ouzhx on 2016/12/27.
 */
public class MediaAdapter implements MediaPlayer {
  AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(String audioType) {
    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMediaPlayer = new VlcPlayer();
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer = new Mp4Palyer();
    }
  }

  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("vlc")) {
      advancedMediaPlayer.playVlc(fileName);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer.playMp4(fileName);
    }
  }
}
