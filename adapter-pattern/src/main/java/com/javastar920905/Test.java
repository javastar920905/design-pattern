package com.javastar920905;

/**
 * Created by ouzhx on 2016/12/27.
 */
public class Test {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();
    audioPlayer.play("mp3", "beyond the horizon.mp3");
    audioPlayer.play("mp4", "alone.mp4");
    audioPlayer.play("vlc", "far far away.vlc");
    audioPlayer.play("avi", "mind me.avi");
  }
}
