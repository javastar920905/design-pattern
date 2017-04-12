package com.javastar920905.impl;

import com.javastar920905.AdvancedMediaPlayer;

/**
 * Created by ouzhx on 2016/12/27.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
  public void playVlc(String fileName) {
    System.out.println("playing vlc file,fileName:" + fileName);
  }

  public void playMp4(String fileName) {
      //什么也不做
  }
}
