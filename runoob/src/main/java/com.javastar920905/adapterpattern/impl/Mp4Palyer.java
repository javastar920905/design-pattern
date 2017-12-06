package com.javastar920905.adapterpattern.impl;


import com.javastar920905.adapterpattern.AdvancedMediaPlayer;

/**
 * Created by ouzhx on 2016/12/27.
 */
public class Mp4Palyer implements AdvancedMediaPlayer {
  public void playVlc(String fileName) {
    // 什么也不做
  }

  public void playMp4(String fileName) {
    System.out.println("playing mp4 file, fileName:" + fileName);
  }
}
